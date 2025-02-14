package org.example.unchecked_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivideNumbers {
    public static void divide(double[]number){
        double result;
        try{
            if(number[1]==0) throw new ArithmeticException();
            result=number[0]/number[1];
            System.out.println(result);
        } catch (ArithmeticException e) {
            System.out.println("Entered Quotient invalid ,Result is undefined ");
        }

    }

    public static double[] takeTwoNumber(Scanner input){
        double[]numbers=new double[2];
        try{

            numbers[0]=input.nextInt();
            numbers[1]=input.nextInt();

        } catch (InputMismatchException e) {
            System.out.println("Please give valid numbers ");
        }
        return numbers;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        double []numbers=takeTwoNumber(input);
        divide(numbers);
    }
}
