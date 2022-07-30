package com.yy.royalmotors.repository;

import com.yy.royalmotors.model.Service;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ServiceRepository extends JpaRepository<Service, Integer> {
}
