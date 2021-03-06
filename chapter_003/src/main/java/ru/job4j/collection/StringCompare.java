package ru.job4j.collection;

import java.util.Comparator;

public class StringCompare implements Comparator<String> {
    @Override
    public int compare(String left, String right) {
        int minLength = Math.min(left.length(), right.length());
        for (int i = 0; i < minLength - 1; i++) {
            int cmp = Character.compare(left.charAt(i), right.charAt(i));
            if (cmp != 0) {
                return cmp;
            }
        }
        if (left.length() != right.length()) {
            return left.length() < right.length() ? -1 : 1;
        }
        return 0;
    }
}
