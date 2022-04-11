package com.practice.spring.transactionisolation;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Artem Anosov
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("users")
public class UserController {

    private final UserCommittedService userCommittedService;
    private final UserCommittedService2 userCommittedService2;

    @GetMapping("committed/get")
    public void get1stUser() throws InterruptedException {
        userCommittedService.get1stUser();
    }

    @PostMapping("committed/update")
    public void update1stUser() throws InterruptedException {
        userCommittedService2.update1stUser();
    }
}
