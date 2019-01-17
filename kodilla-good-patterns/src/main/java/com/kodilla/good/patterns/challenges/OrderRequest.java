package com.kodilla.good.patterns.challenges;

public class OrderRequest {
    private User user;
    private ProductName productName;
    private Double orderQuantity;

    public OrderRequest(User user, ProductName productName, Double orderQuantity) {
        this.user = user;
        this.productName = productName;
        this.orderQuantity = orderQuantity;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
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
