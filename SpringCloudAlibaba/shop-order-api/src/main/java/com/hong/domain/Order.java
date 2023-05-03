package com.hong.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * 订单
 */
@Getter
@Setter
@ToString
@TableName("t_order")
public class Order implements Serializable {
    /**
     * 订单id
     */
    @TableId(type = IdType.AUTO)
    private Long id;
    /**
     * 用户id
     */
    private Long uid;
    /**
     * 用户名
     */
    private String username;
    /**
     * 商品id
     */
    private Long pid;
    /**
     * 商品名
     */
    private String productName;
    /**
     * 单价
     */
    private Double productPrice;
    /**
     * 数量
     */
    private Integer number;

}
