package com.spring.practice.mongodb;

import java.util.UUID;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
@Slf4j
public class CmdRunner implements CommandLineRunner {

    private final UserService userService;

    @Override
    public void run(String... args) {
        log.info("Create user...");
        var user = User.builder()
                .id(UUID.randomUUID())
                .login("user1")
                .password("qwerty")
                .build();
        userService.save(user);
        log.info("User..." + user + " created.");
    }

}
