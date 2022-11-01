package com.backend.backendportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backendportfolio.entity.Experiencia;

@Repository
public interface ExperienciaRepository extends JpaRepository<Experiencia, Integer>{

}
