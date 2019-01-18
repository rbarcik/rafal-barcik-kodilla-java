package com.kodilla.good.patterns.food;

public class FoodOrderRepository implements OrderRepository {
    public void createOrder(Manufacturer manufacturer, ProductName productName, Double orderQuantity){
        System.out.println("Writing order to database " + manufacturer.getName() + " , product " + productName.toString() + " , product quantity " + orderQuantity.toString());
    }
}
