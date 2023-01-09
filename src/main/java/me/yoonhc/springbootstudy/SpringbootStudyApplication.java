package me.yoonhc.springbootstudy;

import java.util.Arrays;
import me.yoonhc.springbootstudy.Listener.ApplicationStartingListener;
import me.yoonhc.springbootstudy.domain.Book;
import org.apache.catalina.connector.Connector;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.boot.web.embedded.tomcat.TomcatServletWebServerFactory;
import org.springframework.boot.web.servlet.server.ServletWebServerFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

//@SpringBootApplication
public class SpringbootStudyApplication {

    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(SpringbootStudyApplication.class);
//        application.addListeners(new ApplicationStartingListener());
//        application.run(args);

//        Class<Book> bookClass = Book.class;
//        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);
//
//        Arrays.stream(bookClass.getDeclaredMethods()).forEach(System.out::println);
//
//        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);

            Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);
    }

//    @Bean
//    public ServletWebServerFactory serverFactory(){
//        TomcatServletWebServerFactory tomcat = new TomcatServletWebServerFactory();
//        tomcat.addAdditionalTomcatConnectors(createStandardConnector());
//        return tomcat;
//    }

//    private Connector createStandardConnector() {
//        Connector connector = new Connector("org.apache.coyote.http11.Http11NioProtocol");
//        connector.setPort(8080);
//        return connector;
//    }
}
