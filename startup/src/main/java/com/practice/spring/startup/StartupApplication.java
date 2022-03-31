package com.practice.spring.startup;

import javax.annotation.PostConstruct;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class StartupApplication {

    @PostConstruct
    private void init() {
        System.out.println("------------------------------------------");
        System.out.println("POST-CONSTRUCT-STARTUP-APPLICATION-CLASS...");
        System.out.println("------------------------------------------");
    }

    public static void main(String[] args) {
        SpringApplication.run(StartupApplication.class, args);
    }

}
