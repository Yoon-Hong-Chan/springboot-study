package me.yoonhc.springbootstudy.Listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;
import org.springframework.util.StopWatch;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Component
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    private Logger logger = LoggerFactory.getLogger(ApplicationStartedListener.class);

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

    @Autowired
    WebClient.Builder builder;

    @Override
    public void onApplicationEvent(ApplicationStartedEvent applicationStartedEvent) {
        RestTemplate restTemplate = restTemplateBuilder.build();

        StopWatch stopWatch = new StopWatch();
        stopWatch.start();

        String result = restTemplate.getForObject("http://localhost:8080/api-test", String.class);
        System.out.println(result);

        String result2 = restTemplate.getForObject("http://localhost:8080/api-test2", String.class);
        System.out.println(result2);

        stopWatch.stop();
        System.out.println(stopWatch.prettyPrint());

        WebClient webClient = builder.build();
        StopWatch stopWatch2 = new StopWatch();
        stopWatch2.start();
        Mono<String> resultMono = webClient.get().uri("http://localhost:8080/api-test")
                .retrieve()
                .bodyToMono(String.class);

        resultMono.subscribe(s -> {
            System.out.println(s);
            if(stopWatch2.isRunning()){
                stopWatch2.stop();
            }
            System.out.println(stopWatch2.prettyPrint());

            stopWatch2.start();
        });

        Mono<String> resultMono2 = webClient.get().uri("http://localhost:8080/api-test2")
                .retrieve()
                .bodyToMono(String.class);

        resultMono2.subscribe(s -> {
            System.out.println(s);
            if(stopWatch2.isRunning()){
                stopWatch2.stop();
            }
            System.out.println(stopWatch2.prettyPrint());

            stopWatch2.start();
        });

        stopWatch2.stop();
        System.out.println(stopWatch.prettyPrint());

    }
}
