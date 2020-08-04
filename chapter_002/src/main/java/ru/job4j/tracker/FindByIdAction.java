package ru.job4j.tracker;

public class FindByIdAction implements UserAction {
    private final Output out;

    public FindByIdAction(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Find by Id";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        out.println(new Object("=== Find item by id ===="));
        int id = input.askInt("Enter id of item: ");
        Item item = tracker.findById(id);
        if (item != null) {
            out.println(new Object(item.toString()));
        } else {
            out.println(new Object("Item not exist!"));
        }
        return true;
    }

}
