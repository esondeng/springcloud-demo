package com.springcloud.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.demo.consumer.service.TestService;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@RestController
public class ClientController {
    @Autowired
    private TestService testService;

    @GetMapping(value = "/echo-feign/{str}")
    public String feign(@PathVariable String str) {
        return testService.echo(str);
    }
}
