package com.springcloud.demo.provider.controller;

import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.demo.client.query.TestQuery;
import com.springcloud.demo.client.response.TestTo;
import com.springcloud.demo.client.service.TestService;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@RestController
@EnableDiscoveryClient
public class TestController implements TestService {

    @PostMapping(value = "/echo")
    @Override
    public TestTo echo(@RequestBody TestQuery testQuery) {
        TestTo testTo = new TestTo();
        testTo.setName(testQuery.getName());

        return testTo;
    }
}
