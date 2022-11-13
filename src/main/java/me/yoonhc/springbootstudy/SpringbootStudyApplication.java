package me.yoonhc.springbootstudy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(SpringbootStudyApplication.class);
        application.addListeners(new ApplicationStartingListener());
        application.run(args);
    }
}
