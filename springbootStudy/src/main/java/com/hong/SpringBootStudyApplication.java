package com.hong;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.transaction.annotation.EnableTransactionManagement;

/**
 * @author cmss-hong
 */
@Slf4j
@SpringBootApplication
@EnableScheduling
@EnableTransactionManagement(proxyTargetClass = true)
//@MapperScan({"org.apache.griffin.core.*.dao","org.apache.griffin.core.*.mapper"})
public class SpringBootStudyApplication {
    public static void main(String[] args) {
        log.info("application start");
        SpringApplication.run(SpringBootStudyApplication.class, args);
    }

}
