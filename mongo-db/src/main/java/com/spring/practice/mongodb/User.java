package com.spring.practice.mongodb;

import java.util.UUID;
import lombok.Builder;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Document(collection = "users")
@Data
@Builder
public class User {

    @Id
    private UUID id;


    @Field(value = "login")
    @Indexed(unique = true)
    private String login;

    @Field(value = "password")
    private String password;
}
