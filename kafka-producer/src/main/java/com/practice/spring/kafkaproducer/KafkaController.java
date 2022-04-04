package com.practice.spring.kafkaproducer;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Artem Anosov
 */
@RestController
@RequestMapping("kafka-producer")
@RequiredArgsConstructor
public class KafkaController {

    private final UserProducer userProducer;

    @GetMapping("send")
    public String sendMsgToUserTopic() {
        userProducer.send();
        return "message sent...";
    }
}
