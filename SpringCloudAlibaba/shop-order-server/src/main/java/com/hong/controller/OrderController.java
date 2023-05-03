package com.hong.controller;

import com.hong.domain.Order;
import com.hong.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("order")
public class OrderController {
    @Autowired
    private OrderService orderService;

    // 正常应该使用 PostMapping ，这里为了直接从浏览器测试方便，使用get
    @GetMapping("/save")
    public Order create(Long pid, Long uid) {
        Order order = orderService.createOrder(pid, uid);
        return order;
    }
}
