package com.pluralsight.finance;

public class Jewlery extends FixedAsset{
    private double karat;

    public Jewlery(String name, double value, double karat) {
        super(name, value);
        this.karat = karat;
    }


    @Override
    public double getValue() {
        return 0;
    }
}
