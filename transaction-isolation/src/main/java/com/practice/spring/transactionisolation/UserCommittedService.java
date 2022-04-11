package com.practice.spring.transactionisolation;

import com.practice.spring.model.user.User;
import javax.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Artem Anosov
 */
@Service
@RequiredArgsConstructor
public class UserCommittedService {

    private final UserRepo userRepo;

    @Transactional(propagation = Propagation.REQUIRES_NEW ,isolation = Isolation.SERIALIZABLE)
    public void get1stUser() throws InterruptedException {
        User firstTime = userRepo.findById(1L).orElseThrow(EntityNotFoundException::new);
        System.out.println(firstTime);
        Thread.sleep(5000L);
        User secondTime = userRepo.findById(1L).orElseThrow(EntityNotFoundException::new);
        System.out.println(secondTime);
    }
}
