package com.kodilla.good.patterns.food;

public interface OrderRepository {
    void createOrder(Manufacturer manufacturer, ProductName productName, Double orderQuantity);
}
