package com.renting;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.renting.dao")
public class ManagesysApplication {

    public static void main(String[] args) {
        SpringApplication.run(ManagesysApplication.class, args);
    }

}
