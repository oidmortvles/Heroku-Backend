package com.backend.backendportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backendportfolio.entity.Educacion;

@Repository
public interface EducacionRepository extends JpaRepository<Educacion, Integer>{

}
