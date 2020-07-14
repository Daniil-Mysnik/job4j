package ru.job4j.condition;

import org.junit.Test;

import static org.junit.Assert.*;

public class SqAreaTest {

    @Test
    public void testSquare1() {
        double expected = 3;
        double actual = SqArea.square(9, 3);
        assertEquals(expected, actual, 0.01);
    }

    @Test
    public void testSquare2() {
        double expected = 4;
        double actual = SqArea.square(12, 4);
        assertEquals(expected, actual, 0.01);
    }

}