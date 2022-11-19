package me.yoonhc.springbootstudy.etc;

import me.yoonhc.Holoman;
import me.yoonhc.springbootstudy.property.HongChanProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HolomanRunner implements ApplicationRunner {
    @Autowired
    Holoman holoman;

    @Autowired
    HongChanProperties properties;

    @Autowired
    private String hello;
    @Override
    public void run(ApplicationArguments args) throws Exception {
//        System.out.println("adminFullName : "+properties.getFullName());
//        System.out.println("adminName : "+properties.getName());
//        System.out.println("age : "+properties.getAge());
//        System.out.println(holoman);
//
//        System.out.println("===========");
//        System.out.println(hello);
//        System.out.println("===========");
    }
}
