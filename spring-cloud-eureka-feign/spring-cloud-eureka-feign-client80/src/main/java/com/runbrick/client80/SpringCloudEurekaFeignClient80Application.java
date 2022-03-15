package com.runbrick.client80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringCloudEurekaFeignClient80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaFeignClient80Application.class, args);
    }
}
