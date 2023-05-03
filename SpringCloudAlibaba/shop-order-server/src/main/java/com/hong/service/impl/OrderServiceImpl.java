package com.hong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hong.domain.Order;
import com.hong.domain.Product;
import com.hong.mapper.OrderMapper;
import com.hong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@Service
@Transactional
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    /**
     * 在启动类中已经有了实例方法，此处直接注入即可
     */
    @Autowired
    private RestTemplate restTemplate;

    /**
     * DiscoveryClient 是在java中nacos注册中心的抽象类，代指nacos注册中心，类似spring中的applicationContext容器
     */
    @Autowired
    private DiscoveryClient discoveryClient;

    @Override
    public Order createOrder(Long pid, Long uid) {
        Order order = new Order();

        // fake user, 正常应该从user-server 查询
        order.setUid(1L);
        order.setUsername("张三");

        // 商品信息远程调用 http://localhost:8081/product/1 接口查询
        Product p = null;
//        p.setId(3L);
//        p.setName("apple");
//        p.setPrice(3000d);

        // 远程调用方案一：
        // 缺点：url硬编码，无法进行负载均衡
//        String url = "http://localhost:8081/product/" + pid;
//        // param1: url， param2: 相应返回值的类型
//        p = restTemplate.getForObject(url, Product.class);


        // 方案二： 使用 nacos-DiscoveryClient ，消除硬编码
        // 缺点：无法进行负载均衡
        // 获取实例对象--获取注册中心中的服务实例 其中参数 serviceId 就是nacos的服务列表中的第一列 “服务名”
        List<ServiceInstance> instances = discoveryClient.getInstances("order-service");
        ServiceInstance serviceInstance = instances.get(0);
        String url = "http://" + serviceInstance.getHost() + ":" + serviceInstance.getPort() + "/product/" + pid;
        p = restTemplate.getForObject(url, Product.class);

        order.setPid(p.getId());
        order.setProductName(p.getName());
        order.setProductPrice(p.getPrice());
        order.setNumber(1);

        super.save(order);
        return order;
    }
}

