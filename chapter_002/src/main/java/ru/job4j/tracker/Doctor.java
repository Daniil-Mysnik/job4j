package ru.job4j.tracker;

public class Doctor extends Profession {
    String academicDegree;
    Patient patient;

    public Doctor() {
    }

    public Doctor(String academicDegree) {
        this.academicDegree = academicDegree;
    }

    public Doctor(String academicDegree, Patient patient) {
        this.academicDegree = academicDegree;
        this.patient = patient;
    }

    public Diagnosis heal(Patient patient) {
        return patient.getDiagnosis();
    }
}
