package com.pluralsight;

public class House extends Asset {
    private String address;
    private int condition;
    private int squareFoot;
    private int lotSize;

    public House(String description, String dateAcquired, double originalCost, String address, int condition, int squareFoot, int lotSize) {
        super(description, dateAcquired, originalCost);
        this.address = address;
        this.condition = condition;
        this.squareFoot = squareFoot;
        this.lotSize = lotSize;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCondition() {
        return condition;
    }

    public void setCondition(int condition) {
        this.condition = condition;
    }

    public int getSquareFoot() {
        return squareFoot;
    }

    public void setSquareFoot(int squareFoot) {
        this.squareFoot = squareFoot;
    }

    public int getLostSize() {
        return lotSize;
    }

    public void setLostSize(int lostSize) {
        this.lotSize = lostSize;
    }

    @Override
    public double getValue() {
        double value = switch (condition) {
            case 1 -> (180 * squareFoot);
            case 2 -> (130 * squareFoot);
            case 3 -> (90 * squareFoot);
            case 4 -> (80 * squareFoot);
            default -> 0;
        };
        value += 0.25 * lotSize;
        return value;
    }
}
