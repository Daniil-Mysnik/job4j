package ru.job4j.io;

import java.util.Scanner;

public class Matches {
    private Player[] players;
    private int numberOfMatches;
    private int currentPlayer = 0;
    private static Scanner scanner = new Scanner(System.in);

    public Matches(Player[] players, int numberOfMatches) {
        this.players = players;
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
    }

    public void currentPlayerGetMatches() {
        getMatches(players[currentPlayer].getName());
        if (currentPlayer == players.length - 1)
            currentPlayer = 0;
        else
            currentPlayer++;
    }

    public String getNameOfWinner() {
        if (currentPlayer == 0)
            return players[players.length - 1].getName();
        return players[currentPlayer - 1].getName();
    }

    public static Player[] numberOfPlayers() {
        System.out.println("Enter number of players:");
        int number = scanner.nextInt();
        Player[] players = new Player[number];
        int i = 0;
        while (number > 0) {
            System.out.println("Player " + (i + 1) + " enter your name:");
            String nameOfPlayer = scanner.next();
            players[i] = new Player(nameOfPlayer);
            number--;
            i++;
        }
        return players;
    }

    public static void main(String[] args) {
        System.out.println("Enter number of matches:");
        int numberOfMatches = scanner.nextInt();
        Matches matches = new Matches(numberOfPlayers(), numberOfMatches);
        while (matches.numberOfMatches > 0) {
            matches.currentPlayerGetMatches();
        }
        System.out.println("Player " + matches.getNameOfWinner() + " is WINNER!");
    }

}

class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
