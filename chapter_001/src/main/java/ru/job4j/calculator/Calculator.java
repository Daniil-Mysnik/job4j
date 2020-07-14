package ru.job4j.calculator;

public class Calculator {
    public static void main(String[] args) {
        int one = 1;
        int two = 2;
        int six = 6;
        int four = 4;
        int five = 5;
        int onePlusTwo = one + two;
        int sixDivTwo = six / two;
        int fiveMinusTwo = five - two;
        int fourTimeTwo = four * two;
        System.out.println(onePlusTwo);
        System.out.println(sixDivTwo);
        System.out.println(fiveMinusTwo);
        System.out.println(fourTimeTwo);
        one = 10;
        two = 11;
        onePlusTwo = one + two;
        System.out.println(onePlusTwo);
        int size = 10;
        size = 100;
        size = size - 5;
        System.out.println(size);
        Calculator.plus(100, 500);
        Calculator.plus(4, 2);
        Calculator.plus(3, 5);
    }

    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
}
