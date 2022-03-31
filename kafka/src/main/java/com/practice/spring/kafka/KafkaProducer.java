package com.practice.spring.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * @author Artem Anosov
 */
@Component
@RequiredArgsConstructor
public class KafkaProducer {

    private final KafkaTemplate<String,String> kafkaTemplate;

    public void sendMessageToTestTopic() {
        kafkaTemplate.send("test-topic", "Test message.");
    }
}
