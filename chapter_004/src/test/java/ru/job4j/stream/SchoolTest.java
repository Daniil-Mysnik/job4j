package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

import static org.junit.Assert.*;

public class SchoolTest {
    private List<Student> students = List.of(new Student("A", 10),
            new Student("B", 20),
            new Student("C", 40),
            new Student("D", 50),
            new Student("E", 60),
            new Student("F", 70),
            new Student("G", 80),
            new Student("H", 90),
            new Student("I", 100));

    @Test
    public void testGetStudents10A() {
        Predicate<Student> predicate = student -> student.getScore() >= 70 && student.getScore() <= 100;
        List<Student> expected = List.of(new Student("F", 70),
                new Student("G", 80),
                new Student("H", 90),
                new Student("I", 100));
        assertEquals(expected, new School().collect(students, predicate));
    }

    @Test
    public void testGetStudents10B() {
        Predicate<Student> predicate = student -> student.getScore() >= 50 && student.getScore() < 70;
        List<Student> expected = List.of(new Student("D", 50),
                new Student("E", 60));
        assertEquals(expected, new School().collect(students, predicate));
    }

    @Test
    public void testGetStudents10C() {
        Predicate<Student> predicate = student -> student.getScore() >= 0 && student.getScore() < 50;
        List<Student> expected = List.of(new Student("A", 10),
                new Student("B", 20),
                new Student("C", 40));
        assertEquals(expected, new School().collect(students, predicate));
    }
}