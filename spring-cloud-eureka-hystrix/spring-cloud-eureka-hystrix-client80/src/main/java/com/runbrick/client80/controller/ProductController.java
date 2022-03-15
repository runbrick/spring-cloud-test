package com.runbrick.client80.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import com.runbrick.client80.service.IProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@DefaultProperties(defaultFallback = "defaultGetInfoFallBack")
public class ProductController {

    @Resource
    IProductService productService;

    @GetMapping("/product/list")
    @HystrixCommand(fallbackMethod = "getInfoFallBack",
            commandProperties = {@HystrixProperty(name = "execution.isolation.thread.timeoutInMilliseconds", value = "1000")})
    public String getList() {
        return productService.getList();
    }


    @GetMapping("/product/info")
    @HystrixCommand
    public String getInfo() {
        return productService.getInfo();
    }

    public String getInfoFallBack() {
        return "客户端请求超时";
    }

    public String defaultGetInfoFallBack() {
        return "客户端全局请求超时";
    }
}
