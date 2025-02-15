package org.example.replace_and_modify_strings.censor_bad_words_in_a_sentence;

import java.util.Scanner;

public class BadWordsRemover {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter text");
        String text = input.nextLine();

        text=text.replaceAll("damn|stupid","****");
        System.out.println(text);
    }
}
