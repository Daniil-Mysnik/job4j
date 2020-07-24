package ru.job4j.tracker;

public class Builder extends Engineer {
    private Object object;

    public Builder(String workExperience, Object object) {
        super(workExperience);
        this.object = object;
    }

    public void toBuild(Object object) {

    }

    public void toDemolish(Object object) {

    }
}
