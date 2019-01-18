package com.kodilla.good.patterns.food;

public class OrderRequest {
    private Manufacturer manufacturer;
    private ProductName productName;
    private Double orderQuantity;

    public OrderRequest(Manufacturer manufacturer, ProductName productName, Double orderQuantity) {
        this.manufacturer = manufacturer;
        this.productName = productName;
        this.orderQuantity = orderQuantity;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public ProductName getProductName() {
        return productName;
    }

    public void setProductName(ProductName productName) {
        this.productName = productName;
    }

    public Double getOrderQuantity() {
        return orderQuantity;
    }

    public void setOrderQuantity(Double orderQuantity) {
        this.orderQuantity = orderQuantity;
    }
}
