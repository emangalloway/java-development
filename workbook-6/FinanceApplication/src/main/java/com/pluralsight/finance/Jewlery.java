package com.pluralsight.finance;

public class Jewlery extends FixedAsset{
    private double karat;
    private double price;

    public Jewlery(String name, double value, double karat,double price) {
        super(name, value);
        this.karat = karat;
        this.price = price;
    }


    @Override
    public double getValue() {
        return price;
    }
}
