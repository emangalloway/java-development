package com.pluralsight;

public class MathApp {
    public static void main(String[] args) {
        // 1.) Highest Salary of Bob and Gary
        double bobSalary = 135673.87;
        double garySalary = 194672.99;
        double highestSalary =  Math.max(bobSalary,garySalary);
        System.out.println("The highest salary is:" + highestSalary);

        // 2.) Smallest price of truck and car
        int carPrice = 37000;
        int truckPrice = 15000;
        int lowestPrice = Math.min(carPrice, truckPrice);
        System.out.println("The cheapest vehicle is priced at:" + lowestPrice);

        // 3.) Area of a Circle
        double radius = 7.25;
        double areaOfCircle = Math.PI * Math.pow(radius, 2);
        System.out.println("The area of a circle that has a radius of 7.25 is:" + areaOfCircle);

        // 4.) Find and display the square root a variable after it is set to 5.0
        double x = 5.0;
        double squareRoot = Math.sqrt(x);
        System.out.println("The square root of 5.0 is:"  + squareRoot);

        // 5.) Find and display the distance between the points (5, 10) and (85, 50)
        double x1 = 5;
        double y1 = 10;
        double x2 = 85;
        double y2= 50;
        // subtract x2 -x1, and y2 -y1
        double sx = x2-x1;
        double sy = y2-y1;
        double distance = Math.hypot(sx,sy);
        System.out.println("The Distance between the two points is:"  + distance);

        //Using another method for question 5.
        int x3 = 5, y3 = 10;
        int x4 = 85, y4 = 50;

        double secondDistance = Math.sqrt(Math.pow(x3 - x4, 2) + Math.pow(y3 - y4, 2));

        System.out.println("Distance between the points: " + secondDistance);

        // 6.) Find and display the absolute (positive) value of a variable after it is set to -3.8
        double originalValue = -3.8;
        double absValue = Math.abs(originalValue);
        System.out.println("The absolute value of -3.8 is:"  + absValue);

        // 7.) Find and display a random number between 0 and 1

        System.out.println( "We will display a random number 1 - 10:" + Math.random());

    }
}
