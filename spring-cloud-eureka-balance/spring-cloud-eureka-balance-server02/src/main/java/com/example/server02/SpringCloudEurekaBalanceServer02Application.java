package com.example.server02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringCloudEurekaBalanceServer02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaBalanceServer02Application.class, args);
    }

}
