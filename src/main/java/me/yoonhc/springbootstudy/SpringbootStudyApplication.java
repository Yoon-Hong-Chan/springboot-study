package me.yoonhc.springbootstudy;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import me.yoonhc.springbootstudy.Listener.ApplicationStartingListener;
import me.yoonhc.springbootstudy.domain.Book;
import me.yoonhc.springbootstudy.domain.Book2;
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

    public static void main(String[] args)
            throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchFieldException {
//        SpringApplication application = new SpringApplication(SpringbootStudyApplication.class);
//        application.addListeners(new ApplicationStartingListener());
//        application.run(args);

//        Class<Book> bookClass = Book.class;
//        Arrays.stream(bookClass.getDeclaredFields()).forEach(System.out::println);
//
//        Arrays.stream(bookClass.getDeclaredMethods()).forEach(System.out::println);
//
//        Arrays.stream(bookClass.getDeclaredConstructors()).forEach(System.out::println);

//            Arrays.stream(Book.class.getAnnotations()).forEach(System.out::println);

        Class<?> bookClass = Class.forName("me.yoonhc.springbootstudy.domain.Book2");
        Constructor<?> constructor = bookClass.getConstructor(String.class);
        Book2 book = (Book2) constructor.newInstance("myBook");
        System.out.println(book);

        Field a = Book2.class.getDeclaredField("A");
        System.out.println(a.get(null));
        a.set(null,"AAAAAAA");
        System.out.println(a.get(null));

        Field b = Book2.class.getDeclaredField("B");
        b.setAccessible(true);
        System.out.println(b.get(book));
        b.set(book,"BBBBBB");
        System.out.println(b.get(book));

        Method c = Book2.class.getDeclaredMethod("c");
        c.setAccessible(true);
        c.invoke(book);

        Method d = Book2.class.getDeclaredMethod("d",int.class,int.class);
        int invoke = (int) d.invoke(book,1, 2);
        System.out.println(invoke);
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
