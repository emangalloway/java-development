package com.pluralsight;

import java.util.HashMap;

public class MainNote {
    public static void main(String[] args) {
        HashMap<String,String> statesAndCapitals = new HashMap<>();
        statesAndCapitals.put("CT", "Hartford");
        statesAndCapitals.put("CA", "Sacramento");
        statesAndCapitals.put("NC", "Raleigh");
        statesAndCapitals.put("TX", "Austin");
        statesAndCapitals.put("FL", "Tallahassee");

        System.out.println(statesAndCapitals);
        System.out.println("The capital of Texas is: "+statesAndCapitals.get("TX"));
    }
}
