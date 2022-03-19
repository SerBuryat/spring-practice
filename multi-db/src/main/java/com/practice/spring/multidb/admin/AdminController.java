package com.practice.spring.multidb.admin;

import com.practice.spring.model.admin.Admin;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Artem Anosov
 */
@RestController
@RequiredArgsConstructor
@RequestMapping("admins")
public class AdminController {

    private final AdminService adminService;

    @GetMapping
    public List<Admin> getAll() {
        return adminService.getAll();
    }
}
