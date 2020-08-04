package ru.job4j.tracker;

public class ShowAllAction implements UserAction {
    private final Output out;

    public ShowAllAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Show all";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(new Object("=== Show all elements ===="));
        for (Item item : tracker.findAll()) {
            out.println(new Object(item.toString()));
        }
        return true;
    }
}
