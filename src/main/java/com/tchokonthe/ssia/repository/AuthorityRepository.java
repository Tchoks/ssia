package com.tchokonthe.ssia.repository;

import com.tchokonthe.ssia.entities.Authority;
import org.springframework.data.mongodb.repository.MongoRepository;

/**
 * @author martin
 * @created on 05/12/2021 at 17:11
 * @project com.tchokonthe.ssia.repository
 * @email (martin.aurele12 @ gmail.com)
 */

public interface AuthorityRepository extends MongoRepository<Authority, Integer> {
}
