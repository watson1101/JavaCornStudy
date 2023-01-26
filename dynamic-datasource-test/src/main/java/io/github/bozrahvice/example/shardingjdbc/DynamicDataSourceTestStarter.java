package io.github.bozrahvice.example.shardingjdbc;

import io.github.bozrahvice.example.shardingjdbc.sql.mapper.BaseMapperScan;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.actuate.autoconfigure.jdbc.DataSourceHealthContributorAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;


@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class, DataSourceHealthContributorAutoConfiguration.class})
@MapperScan(basePackageClasses = BaseMapperScan.class)
public class DynamicDataSourceTestStarter {


    public static void main(String[] args) {
        SpringApplication.run(DynamicDataSourceTestStarter.class, args);
    }
}