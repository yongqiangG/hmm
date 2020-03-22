package com.johnny.hm;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@EnableRabbit
@EnableCaching
@SpringBootApplication
@MapperScan(basePackages = "com.johnny.hm.mapper")
public class HmApplication {

    public static void main(String[] args) {
        SpringApplication.run(HmApplication.class, args);
    }

}
