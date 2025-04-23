package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {
    public static void main(String[] args) {
        //Creating scanner
        Scanner myscanner = new Scanner(System.in);

        //Creating object
        CellPhone cellPhone = new CellPhone();
        CellPhone lukasPhone = new CellPhone();

        //Collect information
        System.out.println("What is the serial number? ");
        int serialNumberFromUser = myscanner.nextInt();
        cellPhone.setSerialNumber(serialNumberFromUser);
        myscanner.nextLine();
        System.out.println("What is the model of the phone? ");
        cellPhone.setModel(myscanner.nextLine());
        System.out.println("What is the carrier? ");
        cellPhone.setCarrier(myscanner.nextLine());
        System.out.println("What is the phone number? ");
        cellPhone.setPhoneNumber(myscanner.nextLine());
        System.out.println("Who is the owner of the phone? ");
        cellPhone.setOwner(myscanner.nextLine());



        System.out.println("The Serial number is: " + cellPhone.getSerialNumber());

       //Create String builder
        StringBuilder cellPhoneInfo = new StringBuilder();
        //append info to string builder
        cellPhoneInfo.append("What is the serial number? ").append(cellPhone.getSerialNumber()).append("\n");
        cellPhoneInfo.append("What is the model of the phone? ").append(cellPhone.getModel()).append("\n");
        cellPhoneInfo.append("What is the carrier? ").append(cellPhone.getCarrier()).append("\n");
        cellPhoneInfo.append("What is the phone number? ").append(cellPhone.getPhoneNumber()).append("\n");
        cellPhoneInfo.append("Who is the owner of the phone? ").append(cellPhone.getOwner());

        System.out.println(cellPhoneInfo);
        cellPhone.dial("123-123-1233");



    }
}
