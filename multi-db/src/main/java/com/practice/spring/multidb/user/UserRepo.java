package com.practice.spring.multidb.user;

import com.practice.spring.model.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 * @author Artem Anosov
 */
@Repository
public interface UserRepo extends CrudRepository<User,Long> {

}
