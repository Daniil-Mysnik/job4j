package ru.job4j.stream;

import java.util.Arrays;
import java.util.List;

public class CutClone {
    public static void main(String[] args) {
        List<Profile> profiles = Arrays.asList(new Profile(new Address("Omsk", "Gagarina", 1, 1)),
                new Profile(new Address("Omsk", "Gagarina", 1, 1)),
                new Profile(new Address("Novosibirsk", "Green", 10, 1)));
        new Profiles().collect(profiles).forEach(System.out::println);
    }
}
