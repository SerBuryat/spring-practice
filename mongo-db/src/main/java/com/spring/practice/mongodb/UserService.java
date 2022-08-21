package com.spring.practice.mongodb;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public void save(User user) {
        userRepo.save(user);
    }
}
