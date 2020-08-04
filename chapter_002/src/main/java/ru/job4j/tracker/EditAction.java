package ru.job4j.tracker;

public class EditAction implements UserAction {
    private final Output out;

    public EditAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Edit item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(new Object("=== Edit item ===="));
        int id = input.askInt("Enter id of item: ");
        String name  = input.askStr("Enter name of item: ");
        Item item = new Item(name);
        if (tracker.replace(id, item)) {
            out.println(new Object("Success"));
        } else {
            out.println(new Object("Error"));
        }
        return true;
    }

}
