package com.runbrick.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
// 这个在新版已经被标记为 @Deprecated 所以我们直接用 @EnableHystrix 即可
//@EnableCircuitBreaker
@EnableHystrix
public class SpringCloudEurekaHystrixClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudEurekaHystrixClientApplication.class, args);
    }

}
