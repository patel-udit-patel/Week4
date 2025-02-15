package org.example.advanced_problems.validate_an_ip_address;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//CheckIPAddress-->Validates the given IP address
public class CheckIPAddress {

//    method checks if IP address is valid or not
    public static boolean checkIPAddress(String ip){
        //regex expression for checking ip address
        String regex="^(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)\\.(25[0-5]|2[0-4][0-9]|1?[0-9][0-9]?)$";
        Pattern pattern=Pattern.compile(regex);
        Matcher matcher=pattern.matcher(ip);

        return matcher.matches();
    }

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter IP Address");
        String ip=input.nextLine();

        if(checkIPAddress(ip)){
            System.out.println("Given IP Address is a valid username");
        }
        else{
            System.out.println("Please enter valid IP Address");
        }
    }
}
