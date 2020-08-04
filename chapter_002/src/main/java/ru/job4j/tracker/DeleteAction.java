package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    private final Output out;

    public DeleteAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete item";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(new Object("=== Delete item ===="));
        int id = input.askInt("Enter id of item: ");
        if (tracker.delete(id)) {
            out.println(new Object("Success"));
        } else {
            out.println(new Object("Error"));
        }
        return true;
    }

}
