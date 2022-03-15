package com.runbrick.client80.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient("SPRING-CLOUD-EUREKA-HYSTRIX-CLIENT")
@Component
public interface IProductService {

    @GetMapping("/product/list")
    String getList();

    @GetMapping("/product/info")
    String getInfo();

}
