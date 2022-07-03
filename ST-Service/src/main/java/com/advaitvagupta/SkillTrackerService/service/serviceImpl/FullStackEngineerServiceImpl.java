package com.advaitvagupta.SkillTrackerService.service.serviceImpl;

import com.advaitvagupta.SkillTrackerService.entity.FullStackEngineer;
import com.advaitvagupta.SkillTrackerService.repository.FullStackEngineerRepository;
import com.advaitvagupta.SkillTrackerService.service.FullStackEngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FullStackEngineerServiceImpl implements FullStackEngineerService {

    @Autowired
    FullStackEngineerRepository fullStackEngineerRepository;

    @Override
    public List<FullStackEngineer> createEngineer(FullStackEngineer engData){

        fullStackEngineerRepository.save(engData);
        return fullStackEngineerRepository.findAll();
    }

    @Override
    public FullStackEngineer updateEngineer(String eng_id, FullStackEngineer engData){
        if(fullStackEngineerRepository.existsById(eng_id))
            fullStackEngineerRepository.save(engData);
        else return null;
        return (FullStackEngineer) fullStackEngineerRepository.findById(eng_id).get();
    }
}
