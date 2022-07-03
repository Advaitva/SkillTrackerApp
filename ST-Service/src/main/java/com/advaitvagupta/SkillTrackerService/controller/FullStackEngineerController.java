package com.advaitvagupta.SkillTrackerService.controller;

import com.advaitvagupta.SkillTrackerService.entity.FullStackEngineer;
import com.advaitvagupta.SkillTrackerService.service.FullStackEngineerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/skill-tracker/api/v1/engineer")
public class FullStackEngineerController {

    @Autowired
    FullStackEngineerService fullStackEngineerService;

    @PostMapping("/add-profile")
    public List<FullStackEngineer> addEngineer(@RequestBody FullStackEngineer engData){

      return  fullStackEngineerService.createEngineer(engData);

    }

    @PutMapping("/update-profile/{eng_id}")
    public FullStackEngineer updateEngineer(@RequestBody FullStackEngineer engData, @PathVariable String eng_id){

        return fullStackEngineerService.updateEngineer(eng_id, engData);

    }

}
