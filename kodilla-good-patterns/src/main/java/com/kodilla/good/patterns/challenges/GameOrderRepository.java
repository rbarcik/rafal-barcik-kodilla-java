package com.kodilla.good.patterns.challenges;

public class GameOrderRepository implements OrderRepository{
    public void createOrder(User user, ProductName productName, Double productQuantity){
        System.out.println("Zamówienie od " + user.getName() + " " + user.getSurname() + " na " + productName.toString() + " w ilości " + productQuantity.toString() + " zostało zapisane do bazy.");
    }
}
