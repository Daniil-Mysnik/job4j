package ru.job4j.tracker;

public class Project {
    private String projectName;
    private String term;

    public Project(String projectName, String term) {
        this.projectName = projectName;
        this.term = term;
    }

    public String getProjectName() {
        return projectName;
    }

    public String getTerm() {
        return term;
    }
}
