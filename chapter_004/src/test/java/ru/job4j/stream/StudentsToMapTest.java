package ru.job4j.stream;

import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class StudentsToMapTest {
    @Test
    public void testStudentsToMap() {
        List<Student> students = Arrays.asList(new Student("A", 50),
                new Student("B", 100));
        Map<String, Student> expected = new HashMap<>();
        expected.put("A", new Student("A", 50));
        expected.put("B", new Student("B", 100));
        assertEquals(expected, new StudentsToMap().toMap(students));
    }

}