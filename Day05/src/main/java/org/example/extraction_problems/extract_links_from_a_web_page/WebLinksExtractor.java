package org.example.extraction_problems.extract_links_from_a_web_page;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class WebLinksExtractor {

    public static void main(String[] args) {
        String text = "Visit https://www.google.com and http://example.org for more info.";

        // Regular expression pattern for extracting web links
        String regex = "https?://[a-z]+\\.[a-z]{2,}\\.?[a-z]*";

        // Compile the regex pattern
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(text);

        // Store and print found links
        List<String> links = new ArrayList<>();
        while (matcher.find()) {
            links.add(matcher.group());
        }

        // Print extracted links
        System.out.println(links);
    }

}

