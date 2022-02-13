package com.tchokonthe.ssia.repository;

import com.tchokonthe.ssia.entities.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

/**
 * @author martin
 * @created on 23/11/2021 at 00:27
 * @project com.tchokonthe.ssia.repository
 * @email (martin.aurele12 @ gmail.com)
 */

public interface UserRepository extends MongoRepository<User, Integer> {

    Optional<User> findByUsername(String username);
}
