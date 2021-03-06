package com.kodilla.good.patterns.food;

public class GlutenFreeShopProductName implements ProductName {
    private String name;

    public GlutenFreeShopProductName(String name) {
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
