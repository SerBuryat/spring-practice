package com.practice.spring.startup.runner;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
public class CustomApplicationRunner implements ApplicationRunner {

    @Override
    public void run(ApplicationArguments args) {
        System.out.println("------------------------------------------");
        System.out.println("LOADING-CUSTOM-APPLICATION-RUNNER-COMMAND...");
        System.out.println("------------------------------------------");
    }
}
