package com.pluralsight;

public class SemiTruck extends Vehicle {
    private int numberOfTrailers;

    public void loadCargo(){
        System.out.println("loading");
    }
    public void unloadCargo(){
        System.out.println("Unloading");
    }
}
