package com.kodilla.good.patterns.food;

public class HealthyShopOrderRequestRetriever implements OrderRequestRetriever{
    public OrderRequest retrieve(){

        Manufacturer healthyShop = new Manufacturer("HealthyShop");
        ProductName slimBodyCream = new HealthyShopProductName("Slim Body Cream");
        Double hsOrderQuantity = new Double(1);

        return new OrderRequest(healthyShop, slimBodyCream, hsOrderQuantity);
    }
}
