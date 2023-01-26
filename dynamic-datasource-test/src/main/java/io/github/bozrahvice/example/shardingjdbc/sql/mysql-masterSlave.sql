CREATE DATABASE sharding_master DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding_master;

CREATE TABLE IF NOT EXISTS `test_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


CREATE DATABASE sharding_slave0 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding_slave0;

CREATE TABLE IF NOT EXISTS `test_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


CREATE DATABASE sharding_slave1 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding_slave1;

CREATE TABLE IF NOT EXISTS `test_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;


