package ru.job4j.tracker;

public class Surgeon extends Doctor {
    private String schedule;

    public Surgeon(String academicDegree, String schedule) {
        super(academicDegree);
        this.schedule = schedule;
    }

    public Surgeon(String academicDegree, Patient patient, String schedule) {
        super(academicDegree, patient);
        this.schedule = schedule;
    }

    public void cutOutAppendicitis() {

    }

    public String getSchedule() {
        return schedule;
    }
}
