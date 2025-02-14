package org.example.custom_exception;

import java.util.Scanner;

//AgeValidator -> Validates age is greater than 18 and demonstrates Custom Exception
public class AgeValidator {
    //method throws invalidAgeException if age if <18
    public static void validateAge(int age)throws InvalidAgeException{

           if (age >= 18) {
               System.out.println("Access granted ");
           }
           else {
               throw new InvalidAgeException("Age must be 18 or above ");
           }

    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter age ");
        int age=input.nextInt();

        //Handling InvalidAgeException and printing message
        try {
            validateAge(age);
        } catch (InvalidAgeException e) {
            System.out.println(e.getMessage());
        }
    }
}
