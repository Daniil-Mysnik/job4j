package ru.job4j.collection;

import java.util.Comparator;

public class DepDescComp implements Comparator<String> {
    @Override
    public int compare(String o1, String o2) {
        String[] split1 = o1.split("/");
        String[] split2 = o2.split("/");
        int res = split2[0].compareTo(split1[0]);
        if (res == 0) {
            int minLength = Math.min(split1.length, split2.length);
            for (int i = 1; i < minLength; i++) {
                res = split1[i].compareTo(split2[i]);
                if (res != 0) {
                    break;
                }
            }
            if (res == 0) {
                res = split1.length > split2.length ? 1 : -1;
            }
        }
        return res;
    }
}
