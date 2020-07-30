package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private String firstPlayer;
    private String secondPlayer;
    private boolean player = true;
    private byte numberOfMatches;
    private static Scanner scanner = new Scanner(System.in);

    public Matches(String firstPlayer, String secondPlayer, byte numberOfMatches) {
        this.firstPlayer = firstPlayer;
        this.secondPlayer = secondPlayer;
        this.numberOfMatches = numberOfMatches;
    }

    public void getMatches(String name) {
        System.out.println("Player " + name + ", take 1-3 match(es)!");
        byte number = -1;
        do {
            number = scanner.nextByte();
            if (number < 1 || number > 3) {
                System.out.println("TAKE 1-3 MATCH(ES)!");
            }
        } while (number < 1 || number > 3);
        numberOfMatches -= number;
        if (numberOfMatches > 0) {
            System.out.println("Number of matches: " + numberOfMatches);
        } else {
            System.out.println("Number of matches: " + 0);
        }
        player = !player;
    }

    public String checkPlayer(boolean player) {
        if (player) {
            return firstPlayer;
        }
        return secondPlayer;
    }

    public static void main(String[] args) {
        System.out.println("First player, enter your name!");
        String player1 = scanner.nextLine();
        System.out.println("Second player, enter your name!");
        String player2 = scanner.nextLine();
        Matches matches = new Matches(player1, player2, (byte) 11);
        while (matches.numberOfMatches > 0) {
            matches.getMatches(matches.checkPlayer(matches.player));
        }
        System.out.println("Player " + matches.checkPlayer(!matches.player) + " is WINNER!");
    }

}
