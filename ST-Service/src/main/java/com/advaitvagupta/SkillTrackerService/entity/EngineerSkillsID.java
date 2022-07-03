package com.advaitvagupta.SkillTrackerService.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class EngineerSkillsID implements Serializable {
    @Column(name = "eng_id")
    String eng_id;

    @Column(name = "skill_id")
    String skill_id;


    public EngineerSkillsID() {}

    public EngineerSkillsID(
            String eng_id,
            String skill_id ){
        this.eng_id = eng_id;
        this.skill_id = skill_id;
    }

    public String getEng_id() {
        return eng_id;
    }

    public void setEng_id(String eng_id) {
        this.eng_id = eng_id;
    }

    public String getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(String skill_id) {
        this.skill_id = skill_id;
    }

}
