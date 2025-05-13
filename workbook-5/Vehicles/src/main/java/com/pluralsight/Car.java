package com.pluralsight;

public class Car extends Vehicle {
    private int numberOfDoors;

    public void openTrunk(){
        System.out.println("Beep Beep Beep");
    }
    public void closeTrunk(){
        System.out.println("Beep beep beep close..");
    }
}
