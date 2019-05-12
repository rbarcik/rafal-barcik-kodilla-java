package com.kodilla.patterns2.adapter.bookclassifier;

import com.kodilla.patterns2.adapter.bookclasifier.MedianAdapter;
import com.kodilla.patterns2.adapter.bookclasifier.librarya.Book;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.HashSet;
import java.util.Set;

public class MedianAdapterTestSuite {
    @Test
    public void publicationYearMedianTest() {
        //Given
        Book book1 = new Book("Author1", "Book1", 2005, "1");
        Book book2 = new Book("Author2", "Book2", 2007, "2");
        Book book3 = new Book("Author3", "Book3", 2009, "3");
        Book book4 = new Book("Author4", "Book4", 2015, "4");
        Book book5 = new Book("Author5", "Book5", 2019, "5");
        Set<Book> bookSet = new HashSet<>();
        bookSet.add(book1);
        bookSet.add(book2);
        bookSet.add(book3);
        bookSet.add(book4);
        bookSet.add(book5);
        MedianAdapter medianAdapter = new MedianAdapter();
        //When
        double libraryaMedian = medianAdapter.publicationYearMedian(bookSet);
        //Then
        System.out.println(libraryaMedian);
        assertEquals(libraryaMedian, 2009, 0);
    }
}
