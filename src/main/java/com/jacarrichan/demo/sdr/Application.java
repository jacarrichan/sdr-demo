package com.jacarrichan.demo.sdr;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching //启用缓存，这个注解很重要；
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootApplication.class, args);
    }
}
