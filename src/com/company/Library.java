package com.company;

import java.util.HashMap;

public class Library {
    private HashMap<String, Book> knjige;

    public Library() {
        knjige = new HashMap<>();
    }

    public void addBook(Book book) {
        if(this.knjige.containsKey(titleCorrection(book.getTitle()))) {
            return;
        } else {
            knjige.put(titleCorrection(book.getTitle()), book);
        }
    }

    public void removeBook(Book book) {
        knjige.remove(titleCorrection(book.getTitle()));
    }

    public void removeBook(String naslov) {
        knjige.remove(titleCorrection(naslov));
    }

    public Book findBook(String naslov) {
        return knjige.get(titleCorrection(naslov));
    }

    private String titleCorrection(String naslov) {
        return naslov.trim().toLowerCase();
    }
}
