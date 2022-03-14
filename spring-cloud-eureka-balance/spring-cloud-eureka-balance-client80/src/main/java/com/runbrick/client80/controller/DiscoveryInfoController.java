package com.runbrick.client80.controller;

import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RestController
public class DiscoveryInfoController {


    @Resource
    DiscoveryClient discoveryClient;

    /**
     * 获取当前服务列表
     *
     * @return 服务列表
     */
    @GetMapping("/discovery/info")
    public List<String> discovery() {
        return discoveryClient.getServices();
    }
}
