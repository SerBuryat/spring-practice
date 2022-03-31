package com.practice.spring.h2;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 * @author Artem Anosov
 */
@Configuration
@EnableJpaRepositories
@EntityScan(basePackages = "com.practice.spring.model.user")
public class UserSourceConfig {

}
