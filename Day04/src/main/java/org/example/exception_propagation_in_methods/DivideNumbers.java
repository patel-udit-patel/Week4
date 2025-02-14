package org.example.exception_propagation_in_methods;

import java.util.InputMismatchException;
import java.util.Scanner;

//DivideNumbers ->Demonstrates exception propagation in methods
public class DivideNumbers {

    //this is method1 ->divide([]number) divides one number with other and throws ArithmeticException
    public static void divide(double[]number)throws ArithmeticException{
        double result;
            if(number[1]==0)
                throw new ArithmeticException();

            result=number[0]/number[1];
            System.out.println(result);

    }
    //this is method2->mediatorMethod([]number) ,it calls method1->divide([]number)
    public static void mediatorMethod(double[]numbers){
        divide(numbers);
    }

    //method takes two numbers as input and returns as an array of two elements
    public static double[] takeTwoNumber(Scanner input){
        double[]numbers=new double[2];
        try{

            System.out.println("Enter Dividend and divisor ");
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
        //Handling exception
        try{
            mediatorMethod(numbers);
        }
        catch (ArithmeticException e){
            System.out.println("Invalid divisor entered");
        }
    }
}
