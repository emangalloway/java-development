package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Moped slowRide = new Moped();
        slowRide.setColor("Red");
        slowRide.setFuelCapacity(5);

        Car Honda = new Car();
        Honda.startEngine();
        Honda.accelerate();

        HoverCraft soar9000 = new HoverCraft();
        soar9000.setColor("Matte Black");
        System.out.println("I am on my hover craft, I got it in my favorite color, "+soar9000.getColor());
    }
}
