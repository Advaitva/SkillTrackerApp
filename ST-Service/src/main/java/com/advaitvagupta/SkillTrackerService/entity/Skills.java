package com.advaitvagupta.SkillTrackerService.entity;

import javax.persistence.*;
import java.util.Collection;

@Entity
@Table(name = "SKILLS")
public class Skills {


    @Id
    String skill_id;

    @Column
    String skill;

    @Column
    Boolean is_technical;

    @OneToMany(cascade = CascadeType.ALL)
    Collection<EngineerSkills> engineerSkills;

    public String getSkill_id() {
        return skill_id;
    }

    public void setSkill_id(String skill_id) {
        this.skill_id = skill_id;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public Boolean getIs_technical() {
        return is_technical;
    }

    public void setIs_technical(Boolean is_technical) {
        this.is_technical = is_technical;
    }

    public Collection<EngineerSkills> getEngineerSkills() {
        return engineerSkills;
    }

    public void setEngineerSkills(Collection<EngineerSkills> engineerSkills) {
        this.engineerSkills = engineerSkills;
    }
}
