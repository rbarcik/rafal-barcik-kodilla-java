package com.kodilla.patterns.prototype.library;

import java.util.HashSet;
import java.util.Set;

public class Library extends Prototype{
    private String name;
    private Set<Book> books = new HashSet<>();

    public Library(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public Set<Book> getBooks() {
        return books;
    }

    @Override
    public String toString() {
        String s = "Library [" + name + "]\n";
        for (Book list : books) {
            s = s + list.toString() + "\n";
        }
        return s;
    }

    public Library shallowCopy() throws CloneNotSupportedException {
        return (Library) super.clone();
    }
    public Library deepCopy() throws CloneNotSupportedException {
        Library clonedLibrary = (Library)super.clone();
        clonedLibrary.books = new HashSet<>();
        for(Book theList : books) {
            Book clonedBook = new Book(theList.getTitle(), theList.getAuthor(), theList.getPublicationDate());

            clonedLibrary.getBooks().add(clonedBook);
        }
        return clonedLibrary;
    }
}
