package com.springcloud.demo.provider.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@RestController
@EnableDiscoveryClient
public class TestController {

    @GetMapping(value = "/echo/{string}")
    public String echo(@PathVariable String string) {
        return string;
    }
}
