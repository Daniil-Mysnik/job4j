package ru.job4j.calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class FitTest {

    @Test
    public void manWeight() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        assertEquals(expected, out, 0.01);
    }

    @Test
    public void womanWeight() {
        short in = 164;
        double expected = 62.1;
        double out = Fit.womanWeight(in);
        assertEquals(expected, out, 0.01);
    }
}