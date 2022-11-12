package me.yoonhc.springbootstudy;

import me.yoonhc.Holoman;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootStudyApplication.class, args);
    }

    @Bean
    public Holoman holoman(){
        Holoman holoman = new Holoman();
        holoman.setName("Yoons");
        holoman.setHowLong(60);
        return holoman;
    }
}
