package com.kodilla.good.patterns.food;

public class HealthyShopManufacturerService implements ManufacturerService {
    public void process(Manufacturer manufacturer, ProductName productName, Double orderQuantity){
        System.out.println("Sending order to " + manufacturer.getName() + " , product " + productName.toString() + " , product quantity " + orderQuantity.toString());
    }
}
