package me.yoonhc.springbootstudy;

import java.util.Arrays;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Arguments implements CommandLineRunner,ApplicationRunner {
    @Override
    public void run(String... args) throws Exception {
        Arrays.stream(args).forEach(System.out::println);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Arrays.stream(args.getSourceArgs()).forEach(System.out::println);
        System.out.println("foo: "+args.containsOption("foo"));
        System.out.println("bar: "+args.containsOption("bar"));
    }
}
