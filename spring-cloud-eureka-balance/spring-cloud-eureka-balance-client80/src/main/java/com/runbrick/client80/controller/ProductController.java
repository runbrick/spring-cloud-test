package com.runbrick.client80.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

@RestController
public class ProductController {

    @Resource
    RestTemplate restTemplate;


    public static final String CLIENT_URL = "http://SPRING-CLOUD-EUREKA-BALANCE-CLIENT";

    @GetMapping("product/list")
    public String getList() {
        return restTemplate.getForObject(CLIENT_URL + "/product/list", String.class);
    }


}
