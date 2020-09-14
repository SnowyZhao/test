package com.snowy.helloworld.config;

import com.snowy.helloworld.service.HelloService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author ：liuyuzhen
 * @date ：Created in 2020/8/18 21:54
 * @description：
 * @version: 1.0
 */
@Configuration
public class MyAppConfig {

    @Bean
    public HelloService helloService(){
        return new HelloService();
    }
}
