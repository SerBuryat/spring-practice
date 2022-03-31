package com.practice.spring.startup.event;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
public class AppReadyEvent {

    @EventListener(ApplicationReadyEvent.class)
    public void runAfterStartup() {
        System.out.println("------------------------------------------");
        System.out.println("APPLICATION-READY-EVENT...");
        System.out.println("------------------------------------------");
    }
}
