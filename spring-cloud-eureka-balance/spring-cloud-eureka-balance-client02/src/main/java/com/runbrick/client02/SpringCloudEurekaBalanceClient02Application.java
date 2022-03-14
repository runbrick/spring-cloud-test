package com.runbrick.client02;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaBalanceClient02Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaBalanceClient02Application.class, args);
    }

}
