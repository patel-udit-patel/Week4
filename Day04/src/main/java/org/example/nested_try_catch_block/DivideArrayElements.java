package org.example.nested_try_catch_block;

import java.util.Scanner;

//DivideArrayElements->Demonstrates nested catch blocks
public class DivideArrayElements {
    public static void findElement(int[]array,int index,int divisor){
        try{
            int element=array[index];
            try{
                int ans=element/divisor;
                System.out.println(ans);
            }
            catch (ArithmeticException e){
                System.out.println("Cannot Divide by zero");
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index entered ");
        }

    }
    public static void takeArray(int[]array,Scanner input){
        for(int i=0;i<array.length;i++){
            array[i]= input.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size= sc.nextInt();
        int []numbers=new int[size];
        takeArray(numbers,sc);
        int index= sc.nextInt();
        int divisor= sc.nextInt();
        findElement(numbers,index,divisor);

    }
}
