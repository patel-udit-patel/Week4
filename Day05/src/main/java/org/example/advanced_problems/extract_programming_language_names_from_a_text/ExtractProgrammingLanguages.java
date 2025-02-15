package org.example.advanced_problems.extract_programming_language_names_from_a_text;

import java.util.regex.*;
import java.util.*;

//ExtractProgrammingLanguages--> extracts names of programing languages from text
public class ExtractProgrammingLanguages {
    public static void main(String[] args) {
        String text = "I love Java, Python, and JavaScript, but I haven't tried Go yet.";

        // Regular expression pattern for programming languages
        String regex = "\\b(JavaScript|Java|Python|Go|C\\+\\+|C#|Ruby|Swift|Kotlin|PHP|TypeScript|Rust|Perl|Scala|Dart|Objective-C|R)\\b";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Store matches in a list
        List<String> languages = new ArrayList<>();
        while (matcher.find()) {
            languages.add(matcher.group());
        }

        // Print the extracted programming languages
        System.out.println("Extracted Programming Languages: " + String.join(", ", languages));
    }
}
