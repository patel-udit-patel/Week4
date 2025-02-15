package org.example.advanced_problems.validate_a_credit_card_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//CreditCardNumberChecker-> Validates credit card number
public class CreditCardNumberChecker {

    //method checks if string is valid visa card number
    public static boolean checkVisaCardNumber(String hexColorCode){
        String regex="^4[0-9]{15}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(hexColorCode);

        return matcher.matches();
    }
    //method checks if string is valid master card number
    public static boolean checkMasterCardNumber(String hexColorCode){
        String regex="^5[0-9]{15}$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(hexColorCode);

        return matcher.matches();
    }

    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Visa card number");
        String visa=input.nextLine();

        if(checkVisaCardNumber(visa)){
            System.out.println("Visa card number is valid");
        }
        else{
            System.out.println("Please enter valid Visa card number");
        }

        System.out.println("Enter Master card number ");
        String master=input.nextLine();
        if(checkMasterCardNumber(master)){
            System.out.println("Given Mastercard number is valid");
        }
        else{
            System.out.println("Please enter valid Mastercard number");
        }
    }
}

