package com.pluralsight;

public class Room {
    private int numberOfBeds;
    private double price;
    private boolean isOccupied;
    private boolean isDirty;

    public Room(int numberOfBeds, double price) {
        this.numberOfBeds = numberOfBeds;
        this.price = price;
        this.isOccupied = false;
        this.isDirty = false;
    }

    public int getNumberOfBeds() {
        return numberOfBeds;
    }

    public double getPrice() {
        return price;
    }

    public boolean isOccupied() {
        return isOccupied;
    }

    public boolean isDirty() {
        return isDirty;
    }

    public boolean isAvailable() {
        return !isOccupied && !isDirty;
    }

    //checkIn
    public void checkIn() {
        if (!isOccupied && !isDirty) {
            isOccupied = true;
            isDirty = true;
        }
    }
    public void checkInTwo(){
        if (isAvailable()){
            isOccupied = true;
            isDirty = true;
        }
    }

    //checkOut
    public void checkOut() {
        if (isOccupied && isDirty) {
            isOccupied = false;
        }
    }

    //cleanRoom
    public void cleanRoom(){
        if (!isOccupied && isDirty) {
            isDirty = false;
        }
    }
}