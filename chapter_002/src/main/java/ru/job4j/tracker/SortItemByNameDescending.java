package ru.job4j.tracker;

import java.util.Comparator;

public class SortItemByNameDescending implements Comparator<Item> {
    @Override
    public int compare(Item item, Item t1) {
        return t1.compareTo(item);
    }
}
