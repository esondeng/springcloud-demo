package com.springcloud.demo.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

import com.springcloud.demo.consumer.spring.ConsumerConfig;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@SpringBootApplication
@Import({
        ConsumerConfig.class
})
@EnableFeignClients(basePackages = {"com.springcloud.demo.client.service"})
public class ConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerApplication.class, args);
    }
}
