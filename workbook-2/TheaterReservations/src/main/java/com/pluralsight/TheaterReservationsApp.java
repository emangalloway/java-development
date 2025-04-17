package com.pluralsight;

import javax.sound.midi.Soundbank;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class TheaterReservationsApp {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        //Ask user for full name
        System.out.println("Enter your first and last name: ");
        String fullName = myscanner.nextLine();

        int indexOfSpace = fullName.indexOf(" ");
        String firstName = fullName.substring(0, indexOfSpace);
        String lastName = fullName.substring(indexOfSpace + 1);

        //Ask user for date the want to attend
        System.out.println("Please enter the date you will attend (MM/dd/yyy): ");
        String dateString = myscanner.nextLine();

        //Parse the dat formatter
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        LocalDate date = LocalDate.parse(dateString,formatter);

        //Ask user how many tickets the need
        System.out.println("Enter the amount of tickets you want: ");
        int numTickets = myscanner.nextInt();

        //Display confirmation
        if (numTickets == 1){
            System.out.println(numTickets+" Ticket reserved for "+date+" under "+lastName+", "+firstName);
        }
        else{
            System.out.println(numTickets+" Tickets reserved for "+date+" under "+lastName+", "+firstName);
        }

    }
}
