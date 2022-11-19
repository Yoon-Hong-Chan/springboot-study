package me.yoonhc.springbootstudy.Listener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

public class ApplicationStartingListener implements ApplicationListener<ApplicationStartingEvent> {
    private Logger logger = LoggerFactory.getLogger(ApplicationStartingListener.class);
    @Override
    public void onApplicationEvent(ApplicationStartingEvent applicationStartingEvent) {
        logger.info("=======================");
        logger.info("Application is starting");
        logger.info("=======================");
    }
}
