package org.example.basic_regex_problems.validate_a_username;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckUsername {
    public static boolean checkUsername(String username){
        String regex="^[a-zA-Z]+[a-zA-Z0-9_]{4,14}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(username);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter username");
        String username=input.nextLine();

        if(username.length()<5||username.length()>15){
            System.out.println("Given username is too short");
        }
        else if(checkUsername(username)){
            System.out.println("Given username is a valid username");
        }
        else{
            System.out.println("Please enter valid username");
        }
    }
}
