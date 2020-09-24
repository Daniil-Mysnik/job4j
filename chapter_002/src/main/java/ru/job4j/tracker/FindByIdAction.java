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
    public boolean execute(Input input, Store store) {
        out.println(new Object("=== Find item by id ===="));
        String id = input.askStr("Enter id of item: ");
        Item item = store.findById(id);
        if (item != null) {
            out.println(new Object(item.toString()));
        } else {
            out.println(new Object("Item not exist!"));
        }
        return true;
    }

}
