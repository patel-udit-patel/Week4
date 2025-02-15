package org.example.basic_regex_problems.validate_a_license_plate_number;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CheckLicensePlateNumber {
        public static boolean checkLicenseNumber(String licenceNumber){
            String regex="^[A-Z]{2}+[0-9]{4}$";
            Pattern pattern=Pattern.compile(regex);
            Matcher matcher=pattern.matcher(licenceNumber);

            return matcher.matches();
        }

        public static void main(String[] args) {
            Scanner input=new Scanner(System.in);
            System.out.println("Enter license plate number");
            String number=input.nextLine();

            if(checkLicenseNumber(number)){
                System.out.println("Given license plate number is a valid username");
            }
            else{
                System.out.println("Please enter valid license plate number");
            }
        }
}
