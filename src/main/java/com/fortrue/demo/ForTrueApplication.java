package com.fortrue.demo;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.fortrue.demo.mapper")
public class ForTrueApplication {

    public static void main(String[] args) {
        SpringApplication.run(ForTrueApplication.class, args);
    }

}

