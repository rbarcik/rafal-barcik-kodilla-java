package com.kodilla.good.patterns.food;

public class OrderDto {
    private Manufacturer manufacturer;
    private boolean isOrdered;

    public OrderDto(Manufacturer manufacturer, boolean isOrdered) {
        this.manufacturer = manufacturer;
        this.isOrdered = isOrdered;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public boolean isOrdered() {
        return isOrdered;
    }

    public void setOrdered(boolean ordered) {
        isOrdered = ordered;
    }
}
