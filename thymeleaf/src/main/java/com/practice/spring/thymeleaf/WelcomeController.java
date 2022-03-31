package com.practice.spring.thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Artem Anosov
 */
@Controller
@RequestMapping("welcome")
public class WelcomeController {

    @GetMapping
    public String welcome() {
        return "welcome";
    }
}
