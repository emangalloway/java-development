package com.pluralsight;

import java.util.Scanner;

public class PayrollCalculator {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name:");
        String name = myScanner.nextLine();

        System.out.println("Hello " +name+ " Please enter how many hours you worked this week: ");
        float num = myScanner.nextFloat();
        float hourlyRate = 67.52f;

        System.out.print("You worked "+num+" hours, Your pay rate is: "+hourlyRate+" dollars an hour, Your take home for this pay period is: " +hourlyRate * num);

    }
}
