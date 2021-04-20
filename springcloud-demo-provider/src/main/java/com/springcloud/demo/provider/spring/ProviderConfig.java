package com.springcloud.demo.provider.spring;

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
@ComponentScan({"com.springcloud.demo.provider"})
@PropertySource(value = "classpath:config/${spring.profiles.active:dev}/nacos.properties")
public class ProviderConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer() {
        return new PropertySourcesPlaceholderConfigurer();
    }
}
