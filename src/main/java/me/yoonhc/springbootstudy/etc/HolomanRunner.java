package me.yoonhc.springbootstudy.etc;

import me.yoonhc.Holoman;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class HolomanRunner implements ApplicationRunner {
    @Value("${admin.fullName}")
    private String adminFullName;

    @Value("${admin.name}")
    private String adminName;

    @Value("${admin.age}")
    private int age;

    @Autowired
    Holoman holoman;

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("adminFullName : "+adminFullName);
        System.out.println("adminName : "+adminName);
        System.out.println("age : "+age);
        System.out.println(holoman);
    }
}
