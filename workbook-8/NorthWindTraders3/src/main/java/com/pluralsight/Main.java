package com.pluralsight;

import java.sql.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            Scanner scanner = new Scanner(System.in);
            if (args.length != 2) {
                System.out.println("This app requires you to sign in to run");
                System.exit(1);
            }

            String username = args[0];
            String password = args[1];


            boolean running = false;
            while (!running) {
                System.out.println("What do you want to do?");
                System.out.println("1.) Display all products");
                System.out.println("2.) Display all customers");
                System.out.println("0.) Exit");
                String choice = scanner.nextLine();
                switch (choice) {
                    case "1":
                        displayProducts(username, password);
                        break;
                    case "2":
                        displayCustomers(username, password);
                        break;
                    case "3":
                        running = false;
                        System.exit(1);
                }
            }

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void displayProducts(String Username, String Password) throws ClassNotFoundException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", Username, Password);

            String query = """
                    SELECT ProductName
                    FROM Products
                    """;
            preparedStatement = connection.prepareStatement(query);
            results = preparedStatement.executeQuery(query);

            while (results.next()) {
                String productName = results.getString("ProductName");
                System.out.println("ProductName: " + productName);
            }

        String test = "potato";
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }

    public static void displayCustomers(String Username, String Password) throws ClassNotFoundException {

        Connection connection = null;
        PreparedStatement preparedStatement = null;
        ResultSet results = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind", Username, Password);

            String query = """
                    SELECT CompanyName
                    FROM Customers
                    """;
            preparedStatement = connection.prepareStatement(query);
            results = preparedStatement.executeQuery(query);

            while (results.next()) {
                String productName = results.getString("CompanyName");
                System.out.println("ProductName: " + productName);
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            if (results != null) {
                try {
                    results.close();
                } catch (SQLException e) {
                    e.printStackTrace();
                }
                if (preparedStatement != null) {
                    try {
                        preparedStatement.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
                if (connection != null) {
                    try {
                        connection.close();
                    } catch (SQLException e) {
                        e.printStackTrace();
                    }
                }
            }

        }

    }
}
