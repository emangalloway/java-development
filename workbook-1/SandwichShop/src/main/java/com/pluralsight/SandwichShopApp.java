package com.pluralsight;

import java.util.Scanner;

public class SandwichShopApp {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);
        System.out.println("Please enter you age: ");
        int age = myscanner.nextInt();
        System.out.println("Enter your sandwich size 1 or 2: ");
        int size = myscanner.nextInt();

        double discountUnderSeventeen = .10;
        double discountOverSixtyFive = .20;
        double basePrice = 0;

        if (size == 1 ){
            basePrice = 5.45;
        }else if (size == 2){
            basePrice = 8.95;
        } else {
            System.out.println("Invalid Choice");
            return;
        }

        double finalPrice = 0;
        if (age <=17){
            finalPrice = basePrice - (basePrice*discountUnderSeventeen) ;
        }else if (age>= 65){
            finalPrice = basePrice - (basePrice*discountOverSixtyFive);
        }else {
            finalPrice = basePrice;
        }
        System.out.printf("You owe $%.2f", finalPrice);

    }
}