package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMax1To2Then2() {
        int result = Max.max(1, 2);
        assertThat(result, is(2));
    }

    @Test
    public void testWhen2Max() {
        int result = Max.max(1, 10);
        assertThat(result, is(10));
    }

    @Test
    public void testWhenMatch() {
        int result = Max.max(5, 5);
        assertThat(result, is(5));
    }

    @Test
    public void testMax3ArgWhen3Max() {
        int result = Max.max(1, 2, 3);
        assertThat(result, is(3));
    }

    @Test
    public void testMax3ArgWhen1Max() {
        int result = Max.max(10, 2, 3);
        assertThat(result, is(10));
    }

    @Test
    public void testMax4ArgWhen3Max() {
        int result = Max.max(10, 2, 30, 1);
        assertThat(result, is(30));
    }

    @Test
    public void testMax4ArgWhen2Max() {
        int result = Max.max(10, 20, 3, 5);
        assertThat(result, is(20));
    }

}