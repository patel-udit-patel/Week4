package org.example.advanced_problems.extract_currency_values_from_a_text;

import java.util.regex.*;
import java.util.*;

//CurrencyExtractor--> extracts currency from text
public class CurrencyExtractor {
    public static void main(String[] args) {
        String text = "The price is $45.99, and the discount is 10.50.";

        // Regular expression to match currency values (with or without '$')
        String regex = "\\$?\\d+\\.\\d{2}";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // List to store extracted values
        List<String> currencyValues = new ArrayList<>();

        // Find matches
        while (matcher.find()) {
            currencyValues.add(matcher.group());
        }

        // Print result
        System.out.println(String.join(", ", currencyValues));
    }
}
