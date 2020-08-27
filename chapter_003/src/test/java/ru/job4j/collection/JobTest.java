package ru.job4j.collection;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import static org.hamcrest.Matchers.lessThan;
import static org.junit.Assert.*;

public class JobTest {
    @Test
    public void whenComparatorByNameAndPriority() {
        Comparator<Job> cmpNamePriority = new JobDescByName().thenComparing(new JobDescByPriority());
        int rsl = cmpNamePriority.compare(
                new Job("Impl task", 0),
                new Job("Fix bug", 1)
        );
        assertThat(rsl, lessThan(0));
    }

    @Test
    public void testComparatorByPriorityAndName() {
        Comparator<Job> cmpPriorityName = new JobAscByPriority().thenComparing(new JobAscByName());
        List<Job> jobs = Arrays.asList(
                new Job("AAA", 1),
                new Job("CCC", 0),
                new Job("BBB", 1)
        );
        List<Job> expected = Arrays.asList(
                new Job("CCC", 0),
                new Job("AAA", 1),
                new Job("BBB", 1)
        );
        Collections.sort(jobs, cmpPriorityName);
        assertEquals(expected, jobs);
    }

    @Test
    public void testComparatorAscByName() {
        List<Job> jobs = Arrays.asList(
                new Job("AAA", 0),
                new Job("CCC", 1),
                new Job("BBB", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("AAA", 0),
                new Job("BBB", 2),
                new Job("CCC", 1)
        );
        Collections.sort(jobs, new JobAscByName());
        assertEquals(expected, jobs);
    }

    @Test
    public void testComparatorDescByName() {
        List<Job> jobs = Arrays.asList(
                new Job("AAA", 0),
                new Job("CCC", 1),
                new Job("BBB", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("CCC", 1),
                new Job("BBB", 2),
                new Job("AAA", 0)
        );
        Collections.sort(jobs, new JobDescByName());
        assertEquals(expected, jobs);
    }

    @Test
    public void testComparatorAscByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("CCC", 1),
                new Job("AAA", 0),
                new Job("BBB", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("AAA", 0),
                new Job("CCC", 1),
                new Job("BBB", 2)
        );
        Collections.sort(jobs, new JobAscByPriority());
        assertEquals(expected, jobs);
    }

    @Test
    public void testComparatorDescByPriority() {
        List<Job> jobs = Arrays.asList(
                new Job("CCC", 1),
                new Job("AAA", 0),
                new Job("BBB", 2)
        );
        List<Job> expected = Arrays.asList(
                new Job("BBB", 2),
                new Job("CCC", 1),
                new Job("AAA", 0)
        );
        Collections.sort(jobs, new JobDescByPriority());
        assertEquals(expected, jobs);
    }
}