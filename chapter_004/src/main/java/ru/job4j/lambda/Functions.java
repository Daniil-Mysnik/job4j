package ru.job4j.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class Functions {
    List<Double> diapason(int start, int end, Function<Double, Double> func) {
        List<Double> list = new ArrayList<>();
        while (start < end) {
            list.add(func.apply((double) start));
            start++;
        }
        return list;
    }
}
