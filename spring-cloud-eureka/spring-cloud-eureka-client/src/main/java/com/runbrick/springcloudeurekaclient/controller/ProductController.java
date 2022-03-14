package com.runbrick.springcloudeurekaclient.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {


    @GetMapping("/product/list")
    public String getList() {
        return "获取了列表";
    }

    @GetMapping("/product/info")
    public String getInfo() {
        return "获取了详情";
    }
}
