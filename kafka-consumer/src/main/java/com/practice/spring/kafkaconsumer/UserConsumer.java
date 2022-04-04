package com.practice.spring.kafkaconsumer;

import com.practice.spring.model.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
@RequiredArgsConstructor
public class UserConsumer {

    private final UserRepo userRepo;

    @KafkaListener(
        topics = "${spring.kafka.consumers.user.topic-name}",
        autoStartup = "${spring.kafka.consumers.user.auto-startup}")
    public void getMessage(User user) {
        userRepo.save(user);
        System.out.println(user + " saved in db");
    }
}
