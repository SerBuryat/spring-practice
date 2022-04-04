package com.practice.spring.kafkaproducer;

import com.practice.spring.model.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
@RequiredArgsConstructor
public class UserProducer {

    private final KafkaTemplate<String, User> kafkaTemplate;

    @Value("${spring.kafka.producers.user.topic-name}")
    private String topicName;

    public void send() {
        kafkaTemplate.send(topicName, new User(111L, "Kafka User"));
    }
}
