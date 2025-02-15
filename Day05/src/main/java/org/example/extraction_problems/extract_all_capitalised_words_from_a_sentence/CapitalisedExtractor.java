package org.example.extraction_problems.extract_all_capitalised_words_from_a_sentence;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CapitalisedExtractor {
    public static List<String> extractCapitalised(String text){
        String regex = "[A-Z]+[a-z]*";
        Pattern pattern = Pattern.compile(regex);

        Matcher matcher=pattern.matcher(text);
        List<String> capitalised = new ArrayList<>();
        while (matcher.find()) {
            capitalised.add(matcher.group());
        }
        return  capitalised;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter text for email extraction ");
        String text=input.nextLine();

        List<String>capitalised=extractCapitalised(text);

        System.out.println("Capitalised words extracted from given text");
        System.out.println(capitalised);

    }
}
