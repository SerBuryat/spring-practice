package com.practice.spring.h2.h2;

import com.practice.spring.model.user.User;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

/**
 * @author Artem Anosov
 */
@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepo userRepo;

    public List<User> getAll() {
        return Streamable.of(userRepo.findAll()).toList();
    }

}
