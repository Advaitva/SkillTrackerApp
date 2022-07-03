package com.advaitvagupta.SkillTrackerService.service;

import com.advaitvagupta.SkillTrackerService.entity.FullStackEngineer;

import java.util.List;


public interface FullStackEngineerService {
    List<FullStackEngineer> createEngineer(FullStackEngineer data);

    FullStackEngineer updateEngineer(String eng_id, FullStackEngineer data);

}
