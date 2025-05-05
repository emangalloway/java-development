package com.pluralsight;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        //Create an array
        String[] name = new String[4];
        name[0] = "leah";
        name[1] = "mike";

        //Array list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);

        List<String> kidsName = new ArrayList<>();
        kidsName.add("Noah");
        kidsName.add("Sherry");
        kidsName.add("Leo");

        for (int i = 0; i < kidsName.size() ; i++) {
            System.out.println(kidsName.get(i));

        }

    }
}
