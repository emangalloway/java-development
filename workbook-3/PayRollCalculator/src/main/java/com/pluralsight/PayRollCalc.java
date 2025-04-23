package com.pluralsight;

import java.io.*;
import java.util.Scanner;

public class PayRollCalc {
    public static void main(String[] args) {

        //Create a scanner
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the name of the file employee to process");
        String inputFileName = scanner.nextLine();
        System.out.println("Enter the name of the payroll file to create");
        String outputFileName = scanner.nextLine();

        try {
            //Create a FileReader object connected to the file
            FileReader fileReader = new FileReader(inputFileName);
            BufferedReader bufReader = new BufferedReader(fileReader);

            //Create buffered writer that writes to employees.csv
            FileWriter fileWriter = new FileWriter(outputFileName);
            BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
            //Write to file

            String input;

            //read until there is no more data
            while((input = bufReader.readLine())!=null){
                String[] tokens = input.split("\\|");
                int id = Integer.parseInt(tokens[0]);
                String name = tokens[1];
                double hoursWorked = Double.parseDouble(tokens[2]);
                double payRate = Double.parseDouble(tokens[3]);
                 Employee employee = new Employee(id, name, hoursWorked, payRate);
                bufferedWriter.write(String.format("%d|%s|%.2f\n",employee.getEmployeeId(),employee.getName(),employee.getGrossPay()));
            }
            bufReader.close();
            bufferedWriter.close();
        } catch (Exception e) {
            System.out.println("something went wrong");

        }
    }
}
