package com.kodilla.stream.forumuser;

import java.time.LocalDate;

public final class ForumUser {
    private int forumUserId;
    private String username;
    private char sex;
    private LocalDate dateOfBirth;
    private int counterOfPublichedPosts;

    public ForumUser(final int forumUserId, final String username, final char sex, final LocalDate dateOfBirth, final int counterOfPublichedPosts) {
        this.forumUserId = forumUserId;
        this.username = username;
        this.sex = sex;
        this.dateOfBirth = dateOfBirth;
        this.counterOfPublichedPosts = counterOfPublichedPosts;
    }

    public int getForumUserId() {
        return forumUserId;
    }

    public String getUsername() {
        return username;
    }

    public char getSex() {
        return sex;
    }

    public LocalDate getDateOfBirth() {
        return dateOfBirth;
    }

    public int getCounterOfPublichedPosts() {
        return counterOfPublichedPosts;
    }

    @Override
    public String toString() {
        return "ForumUser{" +
                "forumUserId=" + forumUserId +
                ", username='" + username + '\'' +
                ", sex=" + sex +
                ", dateOfBirth=" + dateOfBirth +
                ", counterOfPublichedPosts=" + counterOfPublichedPosts +
                '}';
    }
}
