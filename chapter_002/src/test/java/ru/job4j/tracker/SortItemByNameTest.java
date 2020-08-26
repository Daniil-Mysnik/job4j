package ru.job4j.tracker;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class SortItemByNameTest {
    @Test
    public void testSort() {
        List<Item> items = Arrays.asList(
                new Item("BBB"),
                new Item("AAA"),
                new Item("CCC")
        );
        List<Item> expected = Arrays.asList(
                new Item("AAA"),
                new Item("BBB"),
                new Item("CCC")
        );
        Collections.sort(items, new SortItemByName());
        assertEquals(expected, items);
    }
}