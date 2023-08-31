package com.sparta.springauth.repository;

import com.sparta.springauth.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

// User - Entity
public interface UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
    Optional<User> findByEmail(String email);
}
