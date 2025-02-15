package org.example.basic_regex_problems.validate_a_hex_color_code;

import org.example.advanced_problems.validate_an_ip_address.CheckIPAddress;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

// CheckHexColorCode--> Validates the correct hexcolor
public class CheckHexColorCode {

    //method checks the given string is hex color or not
    public static boolean checkHexColorCode(String hexColorCode){
        String regex="^#+[0-9A-Fa-f]{6}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(hexColorCode);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Hex Color Code");
        String colorCode=input.nextLine();

        if(checkHexColorCode(colorCode)){
            System.out.println("Given Hex Color Code is a valid username");
        }
        else{
            System.out.println("Please enter valid Hex Color Code");
        }
    }
}
