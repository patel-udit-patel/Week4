package org.example.count_words_in_a_file;

import java.io.*;
import java.util.*;

//WordCount--> Class if created for counting words in a file and top five most frequent words
public class WordCount {
    public static void main(String[] args) {
        //File path of input file
        String filePath = "C:\\Users\\udit0\\OneDrive\\Documents\\CapgeminiTraining\\Assignments\\Week4\\Day03\\src\\main\\java\\org\\example\\count_words_in_a_file\\text_file.txt";
        Map<String, Integer> wordCountMap = new HashMap<>();

        //Using buffer reader for reading input
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] words = line.toLowerCase().split("\\W+");
                for (String word : words) {
                    if (!word.isEmpty()) {
                        wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
                    }
                }
            }
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
            return;
        }

        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCountMap.entrySet());
        sortedWords.sort((a, b) -> b.getValue().compareTo(a.getValue()));

        System.out.println("Total word count: " + wordCountMap.values().stream().mapToInt(Integer::intValue).sum());
        System.out.println("Top 5 most frequent words:");
        sortedWords.stream().limit(5).forEach(entry ->
                System.out.println(entry.getKey() + ": " + entry.getValue()));
    }
}

