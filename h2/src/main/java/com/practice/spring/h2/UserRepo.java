package com.practice.spring.h2;

import com.practice.spring.model.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Artem Anosov
 */
@Repository
public interface UserRepo extends CrudRepository<User,Long> {

}
