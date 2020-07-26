package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("Name1", 100);
        Book second = new Book("Name2", 200);
        Book third = new Book("Name3", 300);
        Book fourth = new Book("Clean Code", 400);
        Book[] books = new Book[4];
        books[0] = first;
        books[1] = second;
        books[2] = third;
        books[3] = fourth;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        Book temp = books[3];
        books[3] = books[0];
        books[0] = temp;
        for (int i = 0; i < books.length; i++) {
            System.out.println(books[i]);
        }
        for (int i = 0; i < books.length; i++) {
            if (books[i].getName().equals("Clean Code")) {
                System.out.println(books[i]);
            }
        }
    }

}
