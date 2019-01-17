package com.kodilla.good.patterns.challenges;


public class OrderRequestRetriever {
    public OrderRequest retrieve(){

        User user = new User("John", "Smith");
        ProductName game1 = new ProductNameGames("ChineseGame", "Java");
        Double gameOrderQuantity = new Double(1);

        return new OrderRequest(user, game1, gameOrderQuantity);
    }
}
