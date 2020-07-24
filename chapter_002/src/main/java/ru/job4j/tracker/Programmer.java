package ru.job4j.tracker;

public class Programmer extends Engineer {
    private String skill;

    public Programmer(String workExperience, String skill) {
        super(workExperience);
        this.skill = skill;
    }

    public void toDesignGame() {

    }

    public String getSkill() {
        return skill;
    }
}
