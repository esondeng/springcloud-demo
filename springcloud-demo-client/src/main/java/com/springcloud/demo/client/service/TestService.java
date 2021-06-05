package com.springcloud.demo.client.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;

import com.springcloud.demo.client.query.TestQuery;
import com.springcloud.demo.client.response.TestTo;

/**
 * @author dengxiaolin
 * @since 2021/06/05
 */
@FeignClient(name = "springcloud-demo-provider")
public interface TestService {
    @PostMapping(value = "/echo")
    TestTo echo(TestQuery testQuery);
}
