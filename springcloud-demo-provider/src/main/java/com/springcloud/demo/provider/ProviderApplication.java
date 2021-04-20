package com.springcloud.demo.provider;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import com.springcloud.demo.provider.spring.ProviderConfig;

/**
 * @author dengxiaolin
 * @since 2021/04/20
 */
@SpringBootApplication
@Import({
        ProviderConfig.class
})
public class ProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProviderApplication.class, args);
    }
}
