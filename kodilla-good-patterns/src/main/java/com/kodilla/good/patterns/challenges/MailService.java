package com.kodilla.good.patterns.challenges;

public class MailService implements InformationService {
    public void inform(User user) {
        System.out.println("Zamówienie od " + user.getName() + " " + user.getSurname() + " zostało przyjęte do realizacji.");
    }
}
