package com.runbrick.client01;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringCloudEurekaBalanceClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaBalanceClient01Application.class, args);
    }

}
