package ru.job4j.tracker;

public class Dentist extends Doctor {
    private String schedule;

    public Dentist(String academicDegree, String schedule) {
        super(academicDegree);
        this.schedule = schedule;
    }

    public Dentist(String academicDegree, Patient patient, String schedule) {
        super(academicDegree, patient);
        this.schedule = schedule;
    }

    public void putASeal() {

    }

    public String getSchedule() {
        return schedule;
    }
}
