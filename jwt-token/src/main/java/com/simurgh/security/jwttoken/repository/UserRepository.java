package com.simurgh.security.jwttoken.repository;

import com.simurgh.security.jwttoken.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Long> {

    Optional<User> findByUsername(String username);

}
