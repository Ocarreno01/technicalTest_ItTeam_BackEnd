package com.manageusers.demo.repository;
import org.springframework.data.jpa.repository.JpaRepository;
import com.manageusers.demo.entity.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    
}