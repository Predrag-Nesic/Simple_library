package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Book k1 = new Book("Na Drini cuprija", "Ivo Andric", "...", 1950);
        Book k2 = new Book("Prokleta Avlija", "Ivo Andric", "...", 1955);
        Book k3 = new Book("Znakovi pored puta", "Ivo Andric", "...", 1950);

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter the title:");
        String title = scan.nextLine();
        System.out.println("Enter the name of the author: ");
        String author = scan.nextLine();
        System.out.println("Enter the summary");
        String summary = scan.nextLine();
        System.out.println("Enter year of issue:");
        int yearOfIssue = Integer.parseInt(scan.nextLine());

        Book k4 = new Book(title, author, summary, yearOfIssue);

        Library library = new Library();

        library.addBook(k1);
        library.addBook(k1);
        library.addBook(k2);
        library.addBook(k3);
        library.addBook(k4);

        System.out.println("Nakon prvog ubacivanja u biblioteku:");

        System.out.println(library.findBook(k1.getTitle()));
        library.removeBook(k1);
        library.removeBook(k2.getTitle());

        System.out.println("Nakon uklanjanja prve i druge knjige:");

        System.out.println(library.findBook(k1.getTitle()));
        System.out.println(library.findBook(k2.getTitle()));

        System.out.println("Unesi naslov knjige koju pretrazujes:");
        String naslovKojiPretrazujem = scan.nextLine();

        System.out.println("Book je: " + library.findBook(naslovKojiPretrazujem));
    }
}
