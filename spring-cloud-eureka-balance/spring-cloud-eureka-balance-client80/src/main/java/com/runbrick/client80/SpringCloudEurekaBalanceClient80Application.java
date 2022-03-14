package com.runbrick.client80;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class SpringCloudEurekaBalanceClient80Application {

    @Bean
    // 由于没有引入 Ribbon 所以这里调用的为 spring-cloud-starter-loadbalancer
    @LoadBalanced
    RestTemplate restTemplate() {
        return new RestTemplate();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaBalanceClient80Application.class, args);
    }

}
