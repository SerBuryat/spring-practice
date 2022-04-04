package com.practice.spring.kafka.topic;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.config.TopicBuilder;

/**
 * @author Artem Anosov
 */
@Configuration
public class UserTopicConfig {

    @Value("${spring.kafka.topics.user.name}")
    private String name;

    @Value("${spring.kafka.topics.user.partition}")
    private Integer partition;

    @Value("${spring.kafka.topics.user.replicas}")
    private Integer replicas;

    // Optional - cause on every pull/push action with non existed topic, topic is gonna creating
    @Bean
    public NewTopic user() {
        return TopicBuilder.name(name)
            .partitions(partition)
            .replicas(replicas)
            .build();
    }
}
