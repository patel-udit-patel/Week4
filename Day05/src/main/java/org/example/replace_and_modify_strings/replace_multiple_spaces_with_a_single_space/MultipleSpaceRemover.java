package org.example.replace_and_modify_strings.replace_multiple_spaces_with_a_single_space;

import java.util.Scanner;

public class MultipleSpaceRemover {

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        System.out.println("Enter text");
        String text = input.nextLine();

        text=text.replaceAll("\\s+"," ");
        System.out.println(text);
    }
}
