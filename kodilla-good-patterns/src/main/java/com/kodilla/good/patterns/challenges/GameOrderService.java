package com.kodilla.good.patterns.challenges;

public class GameOrderService implements OrderService{
    public boolean order(User user, ProductName productName, Double orderQuantity){
        System.out.println("Użytkownik  " + user.getName() + " " + user.getSurname() + " składa zamówienie.");
        return true;
    }
}
