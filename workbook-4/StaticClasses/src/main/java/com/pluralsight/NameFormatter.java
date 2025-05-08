package com.pluralsight;

public class NameFormatter {
    private NameFormatter() {}

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){
        String formattedName = lastName+", "+prefix+". "+firstName+" "+middleName+", "+suffix;
        System.out.println(formattedName);
        return formattedName;
    }

    public static String format(String firstName, String lastName){
        String formattedName = lastName+", "+firstName;
        System.out.println(formattedName);
        return formattedName;
    }

    public static String format(String fullName){
       //Need to split the parts of the fullName String
        String[] nameParts = fullName.split("\\,");
        String lastName = nameParts[0];
        String prefix = nameParts[1];
        String firstName = nameParts[2];
        String middleName = nameParts[3];
        String suffix = nameParts[4];

        //Create if statement to cover different inputs from user
        if (prefix.isBlank()){
            String formattedName = lastName+","+firstName+" "+middleName+", "+suffix;
            System.out.println(formattedName);
        } else if (suffix.isBlank()) {
            String formattedName = lastName+","+prefix+". "+firstName+" "+middleName;
            System.out.println(formattedName);
        } else if (middleName.isBlank()) {
            String formattedName = lastName+","+prefix+". "+firstName+", "+suffix;
            System.out.println(formattedName);
        } else if (prefix.isBlank() && suffix.isBlank() && middleName.isBlank()) {
            String formattedName = lastName+", "+firstName;
            System.out.println(formattedName);
        }
        return null;
    }

    }

