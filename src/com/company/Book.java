package com.company;

public class Book {
    private String title;
    private String author;
    private String summary;
    private int year;

    public Book(String naslov, String author, String summary, int year) {
        this.title = naslov;
        this.author = author;
        this.summary = summary;
        this.year = year;
    }


    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return title + ", " + author + " (" + year + ") \n" + summary;
    }
}
