package ru.job4j.tracker;

public class DeleteAction implements UserAction {
    @Override
    public String name() {
        return "=== Delete item ====";
    }

    @Override
    public boolean execute(Input input, Tracker tracker) {
        int id = input.askInt("Enter id of item: ");
        if (tracker.delete(id)) {
            System.out.println("Success");
        } else {
            System.out.println("Error");
        }
        return true;
    }

}
