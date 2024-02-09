package com.example.springsecurity.repository;

import com.example.springsecurity.model.ERole;
import com.example.springsecurity.model.Role;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RoleRepository extends JpaRepository<Role, Long>{

    Optional<Role> findByName(ERole name);
}
