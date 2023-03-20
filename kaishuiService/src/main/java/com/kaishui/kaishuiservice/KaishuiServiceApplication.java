package com.kaishui.kaishuiservice;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.kaishui.kaishuiservice.mapper")
public class KaishuiServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(KaishuiServiceApplication.class, args);
    }

}
