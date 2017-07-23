package com.topneeds.repositories;

import com.topneeds.entities.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.Repository;

/**
 * ===========================================
 * This repository class is responsible to
 * handle all the database level query
 * management related to user data.
 *
 * Created by Iroshan on 7/23/2017.
 * ===========================================
 */
public interface UserRepository extends Repository<User, Long> {
    
    User save(User user);

    @Query("SELECT user FROM User user WHERE user.userId = ?1")
    User getUserById(Long userId);

}
