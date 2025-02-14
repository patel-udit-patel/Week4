package org.example.exception_propagation;

import java.util.Scanner;

//SimpleInterest -> This class demonstrates exception propagation and throw vs throws
public class SimpleInterest {
    //method returns simple interest and throws IllegalArgumentException if invalid fields are given
    public static double calculateInterest(double amount,double rate,int years) throws  IllegalArgumentException{
        double interest=0;
        if(amount<0||rate<0||years<0){
            //throwing exception
            throw new IllegalArgumentException("Invalid data entered");
        }
        else{
            interest=(amount*rate*years)/100;
        }
        return interest;
    }
    public static void main(String[] args) {
        Scanner input =new Scanner(System.in);

        System.out.println("Enter amount, rate of interest and years ");
        double amount=input.nextDouble();
        double rate=input.nextDouble();
        int years=input.nextInt();
        //Handling exception
        try {
            System.out.println(calculateInterest(amount, rate, years));
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
    }
}
