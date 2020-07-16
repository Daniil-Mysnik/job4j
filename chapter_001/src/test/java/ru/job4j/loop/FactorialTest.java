package ru.job4j.loop;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class FactorialTest {

    @Test
    public void whenCalculateFactorialForFiveThenOneHundreedTwenty() {
        int expected = 120;
        int actual = Factorial.calc(5);
        assertThat(expected, is(actual));
        /* напишите здесь тест, проверяющий, что факториал для числа 5 равен 120. */
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int expected = 1;
        int actual = Factorial.calc(0);
        assertThat(expected, is(actual));
        /* напишите здесь тест, проверяющий, что факториал для числа 0 равен 1. */
    }
}