package com.practice.spring.startup.event;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
public class AppStartedEvent {

    @EventListener(ApplicationStartedEvent.class)
    public void runAfterStartup() {
        System.out.println("------------------------------------------");
        System.out.println("APPLICATION-STARTED-EVENT...");
        System.out.println("------------------------------------------");
    }
}
