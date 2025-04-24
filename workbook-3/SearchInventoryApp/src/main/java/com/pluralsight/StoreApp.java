package com.pluralsight;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class StoreApp {
    public static void main(String[] args) {
        List<Product> inventory = getInventory();
        listAllProduct(inventory);
    }
    public static List<Product> getInventory() {
        List<Product> inventory = new ArrayList<>();
        //We put our code here
//        inventory.add(new Product(145,"Shirt", 12.99));
//        inventory.add(new Product(266, "Newports",10.71));
//        inventory.add(new Product(132, "Creamer",5.67));
//        inventory.add(new Product(112, "Creamer",5.67));
//        inventory.add(new Product(142, "Lighter",2.99));

        return inventory;
    }

    public static void listAllProduct(List<Product> productList) {
        System.out.println("We carry the following inventory: ");
        for (Product product : productList) {
            System.out.println(product);
            try{
                BufferedReader bufferedReader = new BufferedReader(new FileReader("inventory.csv"));
                BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("inventory.csv"));

                String line;
                System.out.println(bufferedReader);

                while((line = bufferedReader.readLine()) != null){
                    String      
                }

            }catch (Exception e){
                System.out.println("An error has occurred");
            }
        }
        }
    }
