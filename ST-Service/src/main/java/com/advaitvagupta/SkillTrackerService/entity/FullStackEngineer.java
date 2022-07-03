package com.advaitvagupta.SkillTrackerService.entity;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.Collection;


@Entity
@Table(name = "FULL_STACK_ENGINEER")
public class FullStackEngineer {

    @Id
    String eng_id;

    @Column(length = 100)
    String name;

    @Column(length = 100)
    String email;

    @Column(length = 10)
    String mobile;

    @Column
    LocalDateTime dateModified;

    @OneToMany(cascade = CascadeType.ALL)
    Collection<EngineerSkills> engineerSkills;

    public String getEng_id() {
        return eng_id;
    }

    public void setEng_id(String eng_id) {
        this.eng_id = eng_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public LocalDateTime getDateModified() {
        return dateModified;
    }

    public void setDateModified(LocalDateTime dateModified) {
        this.dateModified = dateModified;
    }

    public Collection<EngineerSkills> getEngineerSkills() {
        return engineerSkills;
    }

    public void setEngineerSkills(Collection<EngineerSkills> engineerSkills) {
        this.engineerSkills = engineerSkills;
    }


}
