package com.pluralsight;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;

public class PayRollCalc {
    public static void main(String[] args) {

        try {
            //Create a FileReader object connected to the file
            FileReader fileReader = new FileReader("employees.csv");
            BufferedReader bufReader = new BufferedReader(fileReader);

            String input;

            //read until there is no more data
            while((input = bufReader.readLine())!=null){
                String[] tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);
                 Employee employee = new Employee(id, name, hoursWorked, payRate);
                System.out.printf("Employee ID: %d, Name: %s, Gross Pay $%.2f%n",employee.getEmployeeId(),employee.getName(),employee.getGrossPay());
            }
            bufReader.close();
        } catch (Exception e) {
            System.out.println("something went wrong");

        }
    }
}
