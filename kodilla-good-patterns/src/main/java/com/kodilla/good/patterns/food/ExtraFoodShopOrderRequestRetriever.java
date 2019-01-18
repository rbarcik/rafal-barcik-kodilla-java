package com.kodilla.good.patterns.food;

public class ExtraFoodShopOrderRequestRetriever implements OrderRequestRetriever{
    public OrderRequest retrieve(){

        Manufacturer extraFoodShop = new Manufacturer("ExtraFoodShop");
        ProductName slimmingBread = new ExtraFoodShopProductName("Slimming Bread");
        Double efsOrderQuantity = new Double(5);

        return new OrderRequest(extraFoodShop, slimmingBread, efsOrderQuantity);
    }
}
