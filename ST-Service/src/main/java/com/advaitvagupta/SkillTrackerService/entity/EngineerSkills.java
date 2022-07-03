package com.advaitvagupta.SkillTrackerService.entity;

import org.springframework.beans.factory.annotation.Autowired;

import javax.persistence.*;

@Entity
public class EngineerSkills {

    @EmbeddedId
    EngineerSkillsID id;

    @ManyToOne
    @MapsId("eng_id")
    FullStackEngineer engineer;

    @ManyToOne
    @MapsId("skill_id")
    Skills skill;

    @Column
    int expertise;

    public EngineerSkills() {}

    public EngineerSkills(FullStackEngineer engineer, Skills skill) {
        this.engineer = engineer;
        this.skill = skill;
        this.id = new EngineerSkillsID(engineer.getEng_id(), skill.getSkill_id());
    }

    public EngineerSkillsID getId() {
        return id;
    }

    public void setId(EngineerSkillsID id) {
        this.id = id;
    }

    public FullStackEngineer getEngineer() {
        return engineer;
    }

    public void setEngineer(FullStackEngineer engineer) {
        this.engineer = engineer;
    }

    public Skills getSkill() {
        return skill;
    }

    public void setSkill(Skills skill) {
        this.skill = skill;
    }


    public int getExpertise() {
        return expertise;
    }

    public void setExpertise(int expertise) {
        this.expertise = expertise;
    }



}
