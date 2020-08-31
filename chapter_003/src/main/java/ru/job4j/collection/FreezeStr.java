package ru.job4j.collection;


public class FreezeStr {
    public static boolean eq(String left, String right) {
        if (left.length() != right.length()) {
            return false;
        }
        int[] alphabet = new int[256];
        char[] leftChars = left.toCharArray();
        char[] rightChars = right.toCharArray();
        for (int i = 0; i < leftChars.length; i++) {
            alphabet[leftChars[i]]++;
            alphabet[rightChars[i]]--;
        }
        for (int i : alphabet) {
            if (i != 0) {
                return false;
            }
        }
        return true;
    }

}
