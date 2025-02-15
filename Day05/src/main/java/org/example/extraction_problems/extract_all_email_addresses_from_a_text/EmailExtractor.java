package org.example.extraction_problems.extract_all_email_addresses_from_a_text;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmailExtractor {
     public static List<String> checkEmail(String text){
        String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
        Pattern pattern = Pattern.compile(regex);

         Matcher matcher=pattern.matcher(text);
         List<String> emails = new ArrayList<>();
         while (matcher.find()) {
             emails.add(matcher.group());
         }
         return  emails;
     }


    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter text for email extraction ");
        String text=input.nextLine();

        List<String>emails=checkEmail(text);

        System.out.println("Emails extracted from given text");
        System.out.println(emails);

    }
}
