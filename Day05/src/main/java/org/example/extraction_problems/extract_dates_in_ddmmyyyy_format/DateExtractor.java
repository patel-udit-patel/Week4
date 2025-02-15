package org.example.extraction_problems.extract_dates_in_ddmmyyyy_format;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DateExtractor {

    public static void main(String[] args) {
        String text = "The events are scheduled for 12/05/2023, 15/08/2024, and 29/02/2020.";

        // Regular expression pattern for extracting dates in dd/mm/yyyy format
        String regex = "(0[1-9]|[12][0-9]|3[01])/(0[1-9]|1[0-2])/\\d{4}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Store and print found dates
        List<String> dates = new ArrayList<>();
        while (matcher.find()) {
            dates.add(matcher.group());
        }

        // Print extracted dates
        System.out.println(dates);
    }

}

