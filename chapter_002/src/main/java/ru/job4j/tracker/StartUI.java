package ru.job4j.tracker;

import java.util.Arrays;

public class StartUI {
    public static void main(String[] args) {
        Tracker tracker = new Tracker();
        System.out.println(Arrays.toString(tracker.findAll()));
        tracker.add(new Item("Item1"));
        System.out.println(tracker.findById(1));
        System.out.println(Arrays.toString(tracker.findAll()));
        System.out.println(Arrays.toString(tracker.findByName("Item1")));
        System.out.println(Arrays.toString(tracker.findByName("Itemmmmm")));
    }
}
