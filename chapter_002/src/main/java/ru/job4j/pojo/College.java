package ru.job4j.pojo;

import java.util.Calendar;
import java.util.Date;

public class College {
    public static void main(String[] args) {
        Student petya = new Student();
        petya.setFullName("Petrov Petr Petrovich");
        petya.setGroup("123");
        petya.setReceiptDate(new Date(2020, Calendar.FEBRUARY, 1));
        System.out.println(petya.getFullName() + " studied in group " + petya.getGroup() + " from age of " + petya.getReceiptDate());
    }
}
