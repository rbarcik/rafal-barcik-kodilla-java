package com.kodilla.good.patterns.food;

public class Application {
    public static void main(String args[]){
        OrderRequestRetriever efsOrderRequestRetriever = new ExtraFoodShopOrderRequestRetriever();
        OrderRequest orderRequest = efsOrderRequestRetriever.retrieve();
        FoodOrderProcessor efsOrderProcessor = new FoodOrderProcessor( new ExtraFoodShopManufacturerService(), new ExtraFoodShopOrderService(), new FoodOrderRepository());
        efsOrderProcessor.process(orderRequest);

        OrderRequestRetriever hsOrderRequestRetriever = new HealthyShopOrderRequestRetriever();
        OrderRequest hsOrderRequest = hsOrderRequestRetriever.retrieve();
        FoodOrderProcessor hsOrderProcessor = new FoodOrderProcessor( new HealthyShopManufacturerService(), new HealthyShopOrderService(), new FoodOrderRepository());
        hsOrderProcessor.process(hsOrderRequest);

        OrderRequestRetriever gfsOrderRequestRetriever = new GlutenFreeShopOrderRequestRetriever();
        OrderRequest gfsOrderRequest = gfsOrderRequestRetriever.retrieve();
        FoodOrderProcessor gfsOrderProcessor = new FoodOrderProcessor( new GlutenFreeShopManufacturerService(), new GlutenFreeShopOrderService(), new FoodOrderRepository());
        gfsOrderProcessor.process(gfsOrderRequest);
    }
}
