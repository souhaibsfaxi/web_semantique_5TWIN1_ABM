package entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Skill {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String SkillName;
    private String SkillDescription;

    // Other properties and relationships go here

    // Getters and setters for the properties
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getSkillName() {
        return SkillName;
    }

    public void setSkillName(String SkillName) {
        this.SkillName = SkillName;
    }

    public String getSkillDescription() {
        return SkillDescription;
    }

    public void setSkillDescription(String SkillDescription) {
        this.SkillDescription = SkillDescription;
    }
}
