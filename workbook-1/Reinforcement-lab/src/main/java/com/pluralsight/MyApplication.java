package com.pluralsight;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class MyApplication {
    /*public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.println("==============================");
        String name = getName(myscanner);
        System.out.println("==============================");
        int age =getAge(myscanner);
        System.out.println("==============================");
        printNameAndAge(name,age);
        System.out.println("==============================");
        printResult(age);
        System.out.println("==============================");
        printMessage(name,age);
    }
    public static void printMessage(String name, int age) {
        System.out.println("Hello, " + name + "! You are " + age + " Years old.");
    }
    public static String getName(Scanner myscanner){
        System.out.println("Enter your name: ");
        return myscanner.nextLine();
    }
    public static int getAge(Scanner myscanner){
        System.out.println("Enter your age");
        return myscanner.nextInt();
    }
    public static void printNameAndAge(String name, int age){
        System.out.println("Name is: " + name);
        System.out.println("Age is: " + age);
    }
    public static void printResult(int age){
        if (age >= 18) {
            System.out.println("Old enough to vote!");
        } else {
            System.out.println("You are to young to vote!");

    }*/
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of the day that you want(0-6): ");
        int dayNumber = scanner.nextInt();

        String dayName = "";

        if (dayNumber == 0){
            dayName = "Sunday";
        }else if (dayNumber == 1){
            dayName = "Monday";
        } else if (dayNumber == 2){
            dayName = "Tuesday";
        } else if (dayNumber == 3){
            dayName = "Wednesday";
        }else if (dayNumber == 4){
            dayName = "Thursday";
        }else if (dayNumber == 5){
            dayName = "Friday";
        }else if (dayNumber == 6){
            dayName = "Saturday";
        }else{
            System.out.println("Invalid Input!");
            return;
        }
    }}

