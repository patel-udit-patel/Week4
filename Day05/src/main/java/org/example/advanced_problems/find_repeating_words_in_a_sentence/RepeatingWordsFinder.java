package org.example.advanced_problems.find_repeating_words_in_a_sentence;

import java.util.*;
import java.util.regex.*;

//RepeatingWordsFinder prints repeating words from text
public class RepeatingWordsFinder {
    public static void main(String[] args) {
        String text = "This is is a repeated repeated word test.";

        // Regular expression to match words
        String regex = "\\b(\\w+)\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Map to store word frequencies
        Map<String, Integer> wordCount = new HashMap<>();

        // Find words and count occurrences
        while (matcher.find()) {
            String word = matcher.group().toLowerCase(); // Convert to lowercase for case insensitivity
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }

        // Collect repeating words
        List<String> repeatingWords = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            if (entry.getValue() > 1) {
                repeatingWords.add(entry.getKey());
            }
        }

        // Print repeating words
        System.out.println(String.join(", ", repeatingWords));
    }
}

