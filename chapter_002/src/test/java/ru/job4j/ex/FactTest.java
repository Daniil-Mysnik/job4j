package ru.job4j.ex;

import org.junit.Test;

import static org.junit.Assert.*;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void testWithNegativeArg() {
        Fact fact = new Fact();
        fact.calc(-5);
    }

    @Test
    public void testWithZeroArg() {
        Fact fact = new Fact();
        int actual = fact.calc(0);
        assertEquals(1, actual);
    }

    @Test
    public void testPositiveArg() {
        Fact fact = new Fact();
        int actual = fact.calc(5);
        assertEquals(120, actual);
    }

}