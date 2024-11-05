package com.classroommission.infraestructure.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.classroommission.infraestructure.entity.TesteEntity;

@Repository
public interface TesteRepository extends JpaRepository<TesteEntity, Long> {
  TesteEntity findFirstById(Long TesteId);
}
