package ru.job4j.oop;

public class Student extends Object {
    public void song() {
        System.out.println("I believe, i can fly");
    }

    public void music(String lyrics) {
        System.out.println("I can sign a song: " + lyrics);
    }

    public static void main(String[] args) {
        Student petya = new Student();
        String song = "I believe, I can fly";
        petya.music(song);
        petya.music(song);
        petya.music(song);
        petya.song();
        petya.song();
        petya.song();
    }
}
