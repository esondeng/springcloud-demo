package com.springcloud.demo.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springcloud.demo.client.query.TestQuery;
import com.springcloud.demo.consumer.wrapper.TestServiceWrapper;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@RestController
public class ClientController {
    @Autowired
    private TestServiceWrapper testServiceWrapper;

    @GetMapping(value = "/echo-feign")
    public String feign() {
        TestQuery testQuery = new TestQuery();
        testQuery.setName("test");
        testQuery.setAge(10);
        return testServiceWrapper.echo(testQuery).getName();
    }
}
