package com.manageusers.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.manageusers.demo.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
  
}