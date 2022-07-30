package com.yy.royalmotors.repository;

import com.yy.royalmotors.model.Role;
import com.yy.royalmotors.model.RoleEnum;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Integer> {
    Optional<Role> findByName(RoleEnum name);
}
