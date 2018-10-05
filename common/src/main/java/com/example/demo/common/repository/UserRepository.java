package com.example.demo.common.repository;

import com.example.demo.common.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {

  User findByName(String name);
}
