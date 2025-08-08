package com.example.Ecommerce_Mini_Project.repository;


import com.example.Ecommerce_Mini_Project.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
}
