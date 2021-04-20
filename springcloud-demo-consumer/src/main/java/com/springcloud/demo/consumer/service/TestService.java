package com.springcloud.demo.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@FeignClient(name = "springcloud-demo-provider")
public interface TestService {
    @GetMapping(value = "/echo/{str}")
    String echo(@PathVariable("str") String str);
}
