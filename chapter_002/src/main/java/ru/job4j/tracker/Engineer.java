package ru.job4j.tracker;

public class Engineer extends Profession {
    private String workExperience;
    private Project project;

    public Engineer() {
    }

    public Engineer(String workExperience) {
        this.workExperience = workExperience;
    }

    public String getWorkExperience() {
        return workExperience;
    }

    public void toDesign(Project project) {

    }

}
