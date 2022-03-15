package com.runbrick.client01.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;
import java.util.concurrent.TimeUnit;

@RestController
public class ProductController {


    @GetMapping("/product/list")
    public String getList() {
        return "获取了列表";
    }

    @GetMapping("/product/info")
    public String getInfo() {
        int i = new Random().nextInt(3000);
        try {
            TimeUnit.MILLISECONDS.sleep(i);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "获取了详情";
    }
}
