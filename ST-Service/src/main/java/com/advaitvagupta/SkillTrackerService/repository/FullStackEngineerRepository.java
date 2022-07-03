package com.advaitvagupta.SkillTrackerService.repository;

import com.advaitvagupta.SkillTrackerService.entity.FullStackEngineer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
@EnableJpaRepositories("com.advaitvagupta.SkillTrackerService.entity")
public interface FullStackEngineerRepository extends JpaRepository<FullStackEngineer, String> {
}
