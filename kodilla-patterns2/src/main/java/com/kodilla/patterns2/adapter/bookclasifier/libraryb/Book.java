package com.kodilla.patterns2.adapter.bookclasifier.libraryb;

public class Book {
    private final String author;
    private final String tittle;
    private final int yearOfPublication;

    public Book(final String author, final String tittle, final int yearOfPublication) {
        this.author = author;
        this.tittle = tittle;
        this.yearOfPublication = yearOfPublication;
    }

    public String getAuthor() {
        return author;
    }

    public String getTittle() {
        return tittle;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }
}
