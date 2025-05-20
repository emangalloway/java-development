package com.pluralsight.finance;

public class Gold extends FixedAsset{
    private double weight;
    private double price;

    public Gold(String name, double value, double weight, double price) {
        super(name, value);
        this.weight = weight;
        this.price = price;
    }

    @Override
    public double getValue() {
        return price;
    }
}
