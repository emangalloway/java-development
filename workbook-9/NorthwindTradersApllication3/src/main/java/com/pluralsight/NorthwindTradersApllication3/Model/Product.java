package com.pluralsight.NorthwindTradersApllication3.Model;

public class Product {
    private int productId;
    private String ProductName;
    private String category;
    private double unitPrice;

    public Product(int productId, String productName, String category, double unitPrice) {
        this.productId = productId;
        ProductName = productName;
        this.category = category;
        this.unitPrice = unitPrice;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", ProductName='" + ProductName + '\'' +
                ", category='" + category + '\'' +
                ", unitPrice=" + unitPrice +
                '}';
    }
}

