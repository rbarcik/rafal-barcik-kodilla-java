package com.kodilla.testing.library;

import java.util.ArrayList;
import java.util.List;

public class BookLibrary {
    LibraryDatabase libraryDatabase;

    public BookLibrary(LibraryDatabase libraryDatabase){
        this.libraryDatabase = libraryDatabase;
    }
    public List<Book> listBooksWithCondition(String tittleFragment){
        List<Book> bookList = new ArrayList<Book>();
        if(tittleFragment.length() < 3) return bookList;
        List<Book> resultList = libraryDatabase.listBooksWithCondition(tittleFragment);
        if(resultList.size() > 20) return bookList;
        bookList = resultList;
        return bookList;
    }
}
