package me.yoonhc.springbootstudy.etc;

import java.util.Arrays;
import me.yoonhc.springbootstudy.Listener.ApplicationStartedListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Arguments implements CommandLineRunner,ApplicationRunner {
    private Logger logger = LoggerFactory.getLogger(Arguments.class);
    @Override
    public void run(String... args) throws Exception {
//        Arrays.stream(args).forEach(System.out::println);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
//        Arrays.stream(args.getSourceArgs()).forEach(System.out::println);
        logger.debug("foo: "+args.containsOption("foo"));
        logger.debug("bar: "+args.containsOption("bar"));
    }
}
