package com.springcloud.demo.consumer.wrapper;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.springcloud.demo.client.query.TestQuery;
import com.springcloud.demo.client.response.TestTo;
import com.springcloud.demo.client.service.TestService;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@Component
public class TestServiceWrapper {
    @Autowired
    private TestService testService;

    public TestTo echo(TestQuery testQuery) {
        return testService.echo(testQuery);
    }
}
