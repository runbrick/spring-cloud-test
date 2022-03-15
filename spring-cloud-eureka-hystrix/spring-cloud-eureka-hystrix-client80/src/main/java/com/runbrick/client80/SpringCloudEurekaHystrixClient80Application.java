package com.runbrick.client80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

@SpringBootApplication
@EnableEurekaClient
@EnableHystrix
@EnableFeignClients
public class SpringCloudEurekaHystrixClient80Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaHystrixClient80Application.class, args);
    }

}
