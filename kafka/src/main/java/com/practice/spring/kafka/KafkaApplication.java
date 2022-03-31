package com.practice.spring.kafka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.kafka.annotation.PartitionOffset;
import org.springframework.kafka.annotation.TopicPartition;

@SpringBootApplication
public class KafkaApplication {

    public static void main(String[] args) {
        SpringApplication.run(KafkaApplication.class, args);
    }

    @KafkaListener(id = "test", topics = "test-topic")
//        topicPartitions = @TopicPartition(topic = "test-topic",
//            partitionOffsets = {
//                @PartitionOffset(partition = "0", initialOffset = "0"),
//                @PartitionOffset(partition = "1", initialOffset = "0")}))
    public void listen(String in) {
        System.out.println(in);
    }

}
