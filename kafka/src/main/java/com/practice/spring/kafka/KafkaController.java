package com.practice.spring.kafka;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Artem Anosov
 */
@RestController
@RequestMapping("kafka")
@RequiredArgsConstructor
public class KafkaController {

    private final KafkaProducer kafkaProducer;

    @GetMapping("send")
    public String sendMsgToTestKafkaTopic() {
        kafkaProducer.sendMessageToTestTopic();
        return "message sent...";
    }
}
