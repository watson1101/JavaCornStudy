CREATE DATABASE sharding0_master DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding0_master;

CREATE TABLE IF NOT EXISTS `test_table0`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `test_table1`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `global_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `type_value`        VARCHAR(128),
    `type_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE DATABASE sharding1_master DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding1_master;

CREATE TABLE IF NOT EXISTS `test_table0`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `test_table1`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `global_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `type_value`        VARCHAR(128),
    `type_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE DATABASE sharding0_slave0 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding0_slave0;

CREATE TABLE IF NOT EXISTS `test_table0`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `test_table1`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `global_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `type_value`        VARCHAR(128),
    `type_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE DATABASE sharding0_slave1 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding0_slave1;

CREATE TABLE IF NOT EXISTS `test_table0`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `test_table1`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `global_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `type_value`        VARCHAR(128),
    `type_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE DATABASE sharding0_slave2 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding0_slave2;

CREATE TABLE IF NOT EXISTS `test_table0`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `test_table1`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `global_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `type_value`        VARCHAR(128),
    `type_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE DATABASE sharding1_slave0 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding1_slave0;

CREATE TABLE IF NOT EXISTS `test_table0`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `test_table1`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `global_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `type_value`        VARCHAR(128),
    `type_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE DATABASE sharding1_slave1 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding1_slave1;

CREATE TABLE IF NOT EXISTS `test_table0`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `test_table1`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `global_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `type_value`        VARCHAR(128),
    `type_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE DATABASE sharding1_slave2 DEFAULT CHARACTER SET utf8 COLLATE utf8_general_ci;

USE sharding1_slave2;

CREATE TABLE IF NOT EXISTS `test_table0`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `test_table1`
(
    `id`           VARCHAR(32) NOT NULL,
    `trade`        VARCHAR(128),
    `value_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;

CREATE TABLE IF NOT EXISTS `global_table`
(
    `id`           VARCHAR(32) NOT NULL,
    `type_value`        VARCHAR(128),
    `type_name`   VARCHAR(128),
    `gmt_create`   DATETIME,
    `gmt_modified` DATETIME,
    PRIMARY KEY (`id`)
) ENGINE = InnoDB
  DEFAULT CHARSET = utf8;