package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayFilter {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 4, -5, 1, 15, -10, 14, -20, -30);
        List<Integer> filteredList = list.stream()
                .filter(integer -> integer >= 0)
                .collect(Collectors.toList());
        filteredList.forEach(System.out::println);
    }
}
