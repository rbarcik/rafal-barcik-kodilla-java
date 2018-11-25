package com.kodilla.stream;


import com.kodilla.stream.forumuser.Forum;
import com.kodilla.stream.forumuser.ForumUser;


import java.time.LocalDate;
import java.time.Period;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        Forum theForum = new Forum();
        Map<Integer, ForumUser> theResultMapOfUsers = theForum.getList().stream()
                .filter(forumUser -> forumUser.getSex() == 'M')
                .filter(forumUser -> Period.between(forumUser.getDateOfBirth(), LocalDate.now()).getYears() >= 20)
                .filter(forumUser -> forumUser.getCounterOfPublichedPosts() >= 1)
                .collect(Collectors.toMap(ForumUser::getForumUserId, forumUser -> forumUser));

        System.out.println("List ForumUsers contain: " + theResultMapOfUsers.size() +" elements.");
        theResultMapOfUsers.entrySet().stream()
                .map(entry -> "ForumUser No" + entry.getKey() + ": " + entry.getValue())
                .forEach(System.out::println);
    }
}
