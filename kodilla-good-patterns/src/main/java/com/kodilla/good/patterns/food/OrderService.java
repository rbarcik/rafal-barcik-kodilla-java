package com.kodilla.good.patterns.food;

public interface OrderService {
    boolean order(Manufacturer manufacturer, ProductName productName, Double orderQuantity);
}
