package com.kodilla.patterns.prototype.library;

import org.junit.Assert;
import org.junit.Test;

import java.time.LocalDate;

public class LibraryTestSuite {
    @Test
    public void testGetBooks() {
        //Given
        //creating the Books for Library 1
        Library library = new Library("Library 1");
        Book book1 = new Book("Tittle1", "Author1", LocalDate.of(2005,11,01));
        Book book2 = new Book("Tittle2", "Author2", LocalDate.of(2006,11,01));
        Book book3 = new Book("Tittle3", "Author3", LocalDate.of(2007,11,01));

        library.getBooks().add(book1);
        library.getBooks().add(book2);
        library.getBooks().add(book3);


        //making a shallow clone of object library
        Library cloneLibrary = null;
        try {
            cloneLibrary = library.shallowCopy();
            cloneLibrary.setName("Library 2");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //making a deep copy of object library
        Library deepClonedLibrary = null;
        try {
            deepClonedLibrary = library.deepCopy();
            deepClonedLibrary.setName("Library 3");
        } catch (CloneNotSupportedException e) {
            System.out.println(e);
        }

        //When
        library.getBooks().remove(book1);
        //Then
        System.out.println(library);
        System.out.println(cloneLibrary);
        System.out.println(deepClonedLibrary);
        Assert.assertEquals(2 , library.getBooks().size());
        Assert.assertEquals(2, cloneLibrary.getBooks().size());
        Assert.assertEquals(3, deepClonedLibrary.getBooks().size());
        Assert.assertEquals(cloneLibrary.getBooks(), library.getBooks());
        Assert.assertNotEquals(deepClonedLibrary.getBooks(), library.getBooks());
    }
}
