package me.yoonhc.springbootstudy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

@Configuration
public class BaseConfiguration {

    @Bean
    public String hello(){
        return "hello";
    }
    @Bean
    public String hello2(){
        return "hello";
    }

}