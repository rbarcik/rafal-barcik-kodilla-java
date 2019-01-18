package com.kodilla.good.patterns.food;

public class HealthyShopOrderService implements OrderService {
    public boolean order(Manufacturer manufacturer, ProductName productName, Double orderQuantity){
        System.out.println("Getting order " + manufacturer.getName() + " , product " + productName.toString() + " , product quantity " + orderQuantity.toString());
        return true;
    }
}
