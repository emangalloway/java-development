package com.pluralsight;

import javax.sound.midi.Soundbank;

public class Vehicle {
    private String color;
    private int numberOfPassengers;
    private int cargoCapacity;
    private int fuelCapacity;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public int getCargoCapacity() {
        return cargoCapacity;
    }

    public void setCargoCapacity(int cargoCapacity) {
        this.cargoCapacity = cargoCapacity;
    }

    public int getFuelCapacity() {
        return fuelCapacity;
    }

    public void setFuelCapacity(int fuelCapacity) {
        this.fuelCapacity = fuelCapacity;
    }

    public void startEngine(){
        System.out.println("ChekChekChek...Vrmmmm");
    }
    public void stopEngine(){
        System.out.println("...");
    }
    public void accelerate(){
        System.out.println("NEEYYUUVMMM");
    }
    public void breaking(){
        System.out.println("SLowww Downn");
    }
}
