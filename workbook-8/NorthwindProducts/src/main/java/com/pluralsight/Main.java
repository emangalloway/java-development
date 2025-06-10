package com.pluralsight;
import com.mysql.cj.callback.UsernameCallback;
import com.mysql.cj.jdbc.Driver;

import java.net.ConnectException;
import java.sql.*;

public class Main {
    public static void main(String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");

            String username = args[0];
            String password = args[1];

            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/northwind",username,password);
            Statement statement = connection.createStatement();

            String query = """
                    SELECT ProductName
                    FROM products
                    ORDER BY ProductID
                    """;
            ResultSet resultSet = statement.executeQuery(query);
            while (resultSet.next()){
                String product = resultSet.getString("ProductName");
                System.out.println(product);
            }
            resultSet.close();
            connection.close();

        } catch (Exception e){
            System.out.println("error");
        }

    }
}
