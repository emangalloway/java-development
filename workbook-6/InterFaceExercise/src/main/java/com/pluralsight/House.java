package com.pluralsight;

public class House extends FixedAsset{
    private int yearBuilt;
    private int squareFeet;
    private int bedRooms;

    public House(String name, double value, int yearBuilt, int squareFeet, int bedRooms) {
        super(name, value);
        this.yearBuilt = yearBuilt;
        this.squareFeet = squareFeet;
        this.bedRooms = bedRooms;
    }

    @Override
    public double getValue() {
        return super.getValue();
    }
}
