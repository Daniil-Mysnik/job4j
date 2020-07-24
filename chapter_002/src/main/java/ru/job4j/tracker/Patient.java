package ru.job4j.tracker;

public class Patient {
    String name;
    Diagnosis diagnosis;

    public Patient(String name, Diagnosis diagnosis) {
        this.name = name;
        this.diagnosis = diagnosis;
    }

    public String getName() {
        return name;
    }

    public Diagnosis getDiagnosis() {
        return diagnosis;
    }
}
