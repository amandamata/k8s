package com.kubernetes.persistence;

import com.kubernetes.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> {

}

