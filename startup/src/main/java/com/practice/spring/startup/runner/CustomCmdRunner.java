package com.practice.spring.startup.runner;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
public class CustomCmdRunner implements CommandLineRunner {

    @Override
    public void run(String... args) {
        System.out.println("------------------------------------------");
        System.out.println("LOADING-CUSTOM-CMD-RUNNER-COMMAND...");
        System.out.println("------------------------------------------");
    }
}
