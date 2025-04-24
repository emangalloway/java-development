package com.pluralsight;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Locale;

public class FormatDate {
    public static void main(String[] args) {
        //Create the localDateTime variable
        LocalDateTime rightNow = LocalDateTime.now();
        System.out.println("The current date and time is: "+rightNow);

        //Create dateTime formatters
        DateTimeFormatter formatterOne = DateTimeFormatter.ofPattern("MM/dd/yyyy");
        DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DateTimeFormatter formatterThree = DateTimeFormatter.ofPattern("MMMM d, yyyy");
        DateTimeFormatter formatterFour = DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy HH:mm 'in GMT'");

        //create string Print
        String formattedDateOne = rightNow.format(formatterOne);
        String formattedDateTwo = rightNow.format(formatterTwo);
        String formattedDateThree = rightNow.format(formatterThree);
        String formattedDateFour = rightNow.format(formatterFour);
        System.out.println("Today is: "+formattedDateOne);
        System.out.println("Today is: "+formattedDateTwo);
        System.out.println("Today is: "+formattedDateThree);
        System.out.println("Today is: "+formattedDateFour);


    }
}