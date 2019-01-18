package com.kodilla.good.patterns.food;

public class GlutenFreeShopOrderRequestRetriever implements OrderRequestRetriever {
    public OrderRequest retrieve(){

        Manufacturer glutenFreeShop = new Manufacturer("GlutenFreeShop");
        ProductName glutenFreeFlakes = new GlutenFreeShopProductName("Gluten Free Flakes");
        Double gfsOrderQuantity = new Double(10);

        return new OrderRequest(glutenFreeShop, glutenFreeFlakes, gfsOrderQuantity);
    }
}
