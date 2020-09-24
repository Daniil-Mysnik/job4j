package ru.job4j.tracker;

import java.util.Arrays;
import java.util.List;

public class StartUI {
    private final Output out;

    public StartUI(Output out) {
        this.out = out;
    }

    public void init(Input input, Store store, List<UserAction> actions) {
        boolean run = true;
        while (run) {
            this.showMenu(actions);
            int select = input.askInt("Select: ");
            if (select < 0 || select >= actions.size()) {
                out.println(new Object("Wrong input, you can select: 0 .. " + (actions.size() - 1)));
                continue;
            }
            UserAction action = actions.get(select);
            run = action.execute(input, store);
        }
    }

    private void showMenu(List<UserAction> actions) {
        out.println(new Object("Menu."));
        for (int index = 0; index < actions.size(); index++) {
            out.println(new Object(index + ". " + actions.get(index).name()));
        }
    }

    public static void main(String[] args) {
        Output output = new ConsoleOutput();
        Input validate = new ValidateInput(
                output,
                new ConsoleInput()
        );
        try (Store tracker = new SqlTracker()) {
            tracker.init();
            UserAction[] actions = {
                    new CreateAction(output),
                    new ShowAllAction(output),
                    new EditAction(output),
                    new DeleteAction(output),
                    new FindByIdAction(output),
                    new ExitAction()
            };
            new StartUI(output).init(validate, tracker, Arrays.asList(actions));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
