package com.hong.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.hong.domain.Order;

public interface OrderService extends IService<Order> {
    /**
     * 构建订单
     * @param pid
     * @param uid
     * @return
     */
    Order createOrder(Long pid, Long uid);
}
