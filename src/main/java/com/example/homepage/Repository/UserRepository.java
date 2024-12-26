package com.example.homepage.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.homepage.Entity.UserEntity;

public interface UserRepository extends JpaRepository<UserEntity, String>{
    
}
