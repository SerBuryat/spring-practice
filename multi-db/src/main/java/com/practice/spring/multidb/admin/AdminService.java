package com.practice.spring.multidb.admin;

import com.practice.spring.model.admin.Admin;
import java.util.List;
import lombok.RequiredArgsConstructor;
import org.springframework.data.util.Streamable;
import org.springframework.stereotype.Service;

/**
 * @author Artem Anosov
 */
@Service
@RequiredArgsConstructor
public class AdminService {

    private final AdminRepo adminRepo;

    public List<Admin> getAll() {
        return Streamable.of(adminRepo.findAll()).toList();
    }
}
