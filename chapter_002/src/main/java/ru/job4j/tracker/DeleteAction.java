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
    public boolean execute(Input input, Store store) {
        out.println(new Object("=== Delete item ===="));
        String id = input.askStr("Enter id of item: ");
        if (store.delete(id)) {
            out.println(new Object("Success"));
        } else {
            out.println(new Object("Error"));
        }
        return true;
    }

}
