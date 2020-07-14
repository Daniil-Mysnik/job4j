package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testDistance1() {
        double expected = 3;
        double out = Point.distance(0, 0, 3, 0);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void testDistance2() {
        double expected = 4;
        double out = Point.distance(0, 4, 0, 0);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void testDistance3() {
        double expected = 394.15;
        double out = Point.distance(140, 12, 534, 23);
        assertEquals(expected, out, 0.01);
    }
}