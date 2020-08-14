package com.dapl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class DaplApplication {

    public static void main(String[] args) {
        SpringApplication.run(DaplApplication.class, args);
    }

}
