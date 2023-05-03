package com.hong.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hong.domain.Order;
import com.hong.domain.Product;
import com.hong.mapper.OrderMapper;
import com.hong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.client.RestTemplate;

@Service
@Transactional
public class OrderServiceImpl extends ServiceImpl<OrderMapper, Order> implements OrderService {

    /**
     * 在启动类中已经有了实例方法，此处直接注入即可
     */
    @Autowired
    private RestTemplate restTemplate;

    @Override
    public Order createOrder(Long pid, Long uid) {
        Order order = new Order();

        // fake user, 正常应该从user-server 查询
        order.setUid(1L);
        order.setUsername("张三");

        // fake product， 商品信息远程调用 http://localhost:8081/product/1 接口查询
//        Product p = null;
//        p.setId(3L);
//        p.setName("apple");
//        p.setPrice(3000d);

        // 远程调用方案一：
        String url = "http://localhost:8081/product/1";
        // param1: url， param2: 相应返回值的类型
        Product p = restTemplate.getForObject(url, Product.class);

        order.setPid(p.getId());
        order.setProductName(p.getName());
        order.setProductPrice(p.getPrice());
        order.setNumber(1);

        super.save(order);
        return order;
    }
}

