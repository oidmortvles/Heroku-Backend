package com.backend.backendportfolio.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.backend.backendportfolio.entity.Skill;

@Repository
public interface SkillRepository extends JpaRepository<Skill, Integer> {

}
