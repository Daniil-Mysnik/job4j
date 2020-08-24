package ru.job4j.tracker;

import java.util.List;

public class FindByNameAction implements UserAction {
    private final Output out;

    public FindByNameAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by name";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(new Object("=== Find item by name ===="));
        String name = input.askStr("Enter name of item: ");
        List<Item> items = tracker.findByName(name);
        if (items.size() > 0) {
            for (Item item : items) {
                out.println(new Object(item.toString()));
            }
        } else {
            out.println(new Object("Items with such name not exist!"));
        }
        return true;
    }
}
