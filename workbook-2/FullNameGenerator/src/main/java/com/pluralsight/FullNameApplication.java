package com.pluralsight;

import javax.sound.midi.Soundbank;
import javax.swing.*;
import java.util.Scanner;

public class FullNameApplication {
    public static void main(String[] args) {
        System.out.println("Please enter your name");
        System.out.println("First name: ");
        Scanner myscanner = new Scanner(System.in);
        String firstName = myscanner.nextLine();
        System.out.println("Middle name: ");
        String midName = myscanner.nextLine();
        System.out.println("Last name: ");
        String lastName = myscanner.nextLine();
        System.out.println("Suffix");
        String suffix = myscanner.nextLine();

        String fullName =(firstName+ " " +midName+". "+lastName+", "+suffix).trim();
        if (midName.isEmpty()){
            System.out.println(firstName+" "+lastName+", "+suffix);
        }
        else if (suffix.isEmpty()){
            System.out.println(firstName+" "+midName+". "+lastName.trim());
        }
        else {
            System.out.println(fullName);
        }
    }
}
