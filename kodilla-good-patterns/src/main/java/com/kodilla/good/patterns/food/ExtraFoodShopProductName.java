package com.kodilla.good.patterns.food;

public class ExtraFoodShopProductName implements ProductName {
    private String name;

    public ExtraFoodShopProductName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}
