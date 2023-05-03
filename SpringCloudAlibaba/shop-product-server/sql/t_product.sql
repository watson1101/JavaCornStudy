-- `shop-product`.t_product definition

CREATE TABLE `t_product` (
  `id` bigint(20) NOT NULL AUTO_INCREMENT COMMENT '主键',
  `name` varchar(255) DEFAULT NULL COMMENT ' 商品名称',
  `price` double(10,2) DEFAULT NULL COMMENT '商品价格',
  `stock` int(11) DEFAULT NULL COMMENT '库存',
  PRIMARY KEY (`id`)
) -- ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8;
ENGINE=InnoDB DEFAULT CHARSET=utf8;



-- data
INSERT INTO `shop-product`.t_product (id, name, price, stock) VALUES(1, 'xiaomi', 1000.0, 5000);
INSERT INTO `shop-product`.t_product (id, name, price, stock) VALUES(2, 'huawei', 2000.0, 5000);
INSERT INTO `shop-product`.t_product (id, name, price, stock) VALUES(3, 'apple', 3000.0, 5000);
INSERT INTO `shop-product`.t_product (id, name, price, stock) VALUES(4, 'oppo', 4000.0, 5000);
