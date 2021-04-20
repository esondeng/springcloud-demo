package com.springcloud.demo.consumer.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@Configuration
@ComponentScan({"com.springcloud.demo.consumer"})
@PropertySource(value = "classpath:config/${spring.profiles.active:dev}/nacos.properties")
public class ConsumerConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
