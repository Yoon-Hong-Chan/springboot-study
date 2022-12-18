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

@Component
public class ApplicationStartedListener implements ApplicationListener<ApplicationStartedEvent> {
    private Logger logger = LoggerFactory.getLogger(ApplicationStartedListener.class);

    @Autowired
    RestTemplateBuilder restTemplateBuilder;

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
    }
}
