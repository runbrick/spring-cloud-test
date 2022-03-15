package com.runbrick.client80.controller;

import com.runbrick.client80.service.ProductService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.atomic.AtomicInteger;

@RestController
public class ProductController {

    @Resource
    ProductService productService;

    @GetMapping("/product/list")
    public String getList() {
        return productService.getList();
    }

    @GetMapping("/product/info")
    public String getInfo() {
        return productService.getInfo();
    }
}
