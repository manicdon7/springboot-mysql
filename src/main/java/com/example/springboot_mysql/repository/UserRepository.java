package com.example.springboot_mysql.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.springboot_mysql.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
}