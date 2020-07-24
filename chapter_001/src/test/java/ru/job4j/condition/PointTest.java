package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void testDistance1() {
        double expected = 3;
        Point first = new Point(0, 0);
        Point second = new Point(3, 0);
        double out = first.distance(second);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void testDistance2() {
        double expected = 4;
        Point first = new Point(0, 4);
        Point second = new Point(0, 0);
        double out = first.distance(second);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void testDistance3() {
        double expected = 394.15;
        Point first = new Point(140, 12);
        Point second = new Point(534, 23);
        double out = first.distance(second);
        assertEquals(expected, out, 0.01);
    }
}