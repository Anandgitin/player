package com.Dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
    // Custom query methods can be defined here
    
    // For example, find a user by email
   // User findByEmail(String email);
}
