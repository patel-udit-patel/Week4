package org.example.advanced_junit_practice_problems.testing_date_formatterr;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateFormatter {

    // Method to format date from yyyy-MM-dd to dd-MM-yyyy
    public String formatDate(String inputDate) {
        SimpleDateFormat inputFormat = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat outputFormat = new SimpleDateFormat("dd-MM-yyyy");

        try {
            // Parse the input date and format it to the required format
            Date date = inputFormat.parse(inputDate);
            return outputFormat.format(date);
        } catch (ParseException e) {
            // If the input date format is invalid, return null
            return null;
        }
    }
}

