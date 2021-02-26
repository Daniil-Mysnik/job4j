package ru.job4j.di;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        StartUI ui2 = context.getBean(StartUI.class);
        ui.add("Petr Arsentev");
        ui.add("Ivan ivanov");
        ui2.add("DFIfs");
        ui2.add("LKUFGHliafas");
        ui.print();
        ui2.print();
    }
}
