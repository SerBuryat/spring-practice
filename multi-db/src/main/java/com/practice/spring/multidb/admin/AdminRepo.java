package com.practice.spring.multidb.admin;

import com.practice.spring.model.admin.Admin;
import java.util.UUID;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Artem Anosov
 */
@Repository
public interface AdminRepo extends CrudRepository<Admin, UUID> {

}
