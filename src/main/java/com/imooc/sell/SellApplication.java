package com.imooc.sell;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class SellApplication extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(SellApplication.class, args);
    }

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder springApplicationBuilder){
        return super.configure(springApplicationBuilder);
    }
}
