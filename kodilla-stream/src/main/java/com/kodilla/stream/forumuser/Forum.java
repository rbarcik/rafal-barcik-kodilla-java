package com.kodilla.stream.forumuser;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;


public final class Forum {
    private final List<ForumUser> theUsersList = new ArrayList<>();

    public Forum (){
        theUsersList.add(new ForumUser(1, "John Smith", 'M', LocalDate.parse("1978-11-25"), 0));
        theUsersList.add(new ForumUser(2, "Dorothy Newman", 'F', LocalDate.parse("1985-05-17"), 25));
        theUsersList.add(new ForumUser(3, "John Wolkowitz", 'M', LocalDate.parse("1998-09-17"), 1));
        theUsersList.add(new ForumUser(4, "Lucy Riley", 'F', LocalDate.parse("2003-05-17"), 18));
        theUsersList.add(new ForumUser(5, "Owen Rogers", 'M', LocalDate.parse("1985-05-17"), 25));
        theUsersList.add(new ForumUser(6, "Matilda Davies", 'F', LocalDate.parse("2000-04-20"), 45));
        theUsersList.add(new ForumUser(7, "Declan Booth", 'M', LocalDate.parse("1977-07-27"), 95));
        theUsersList.add(new ForumUser(8, "Corinne Foster", 'F', LocalDate.parse("1998-03-16"), 65));
        theUsersList.add(new ForumUser(9, "Khloe fry", 'F', LocalDate.parse("1978-01-09"), 125));

    }
    public List<ForumUser> getList(){
        return new ArrayList<>(theUsersList);
    }
}
