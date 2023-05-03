package com.hong.controller;

import com.alibaba.fastjson.JSON;
import com.hong.domain.Product;
import com.hong.service.ProductService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("product")
public class ProductController {

    @Value("${server.port}")
    private String port;

    @Autowired
    private ProductService productSevice;

    //    @RequestMapping("/products/{pid}")
    @RequestMapping("/{pid}")
    public Product findByPid(@PathVariable("pid") Long pid) {
        log.info("查询{}号商品信息", pid);
        Product product = productSevice.getById(pid);
        // 这里拼接 port 是为了方便辨识负载均衡走了哪个服务
        product.setName(product.getName()+"_"+port);
        log.info("商品查询成功，内容为{}", JSON.toJSONString(product));
        return product;
    }
}
