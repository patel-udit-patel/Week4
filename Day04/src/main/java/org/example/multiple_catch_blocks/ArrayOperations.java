package org.example.multiple_catch_blocks;

import java.util.Scanner;

//ArrayOperations->Demonstrates handling multiple exceptions in array linearSearch by using multiple catch blocks
public class ArrayOperations {
    //method prints element at given index
    public static void findElement(int[]array,int index){
        try{
            int element=array[index];
            System.out.println(element);
        }
        // handling ArrayIndexOutOfBoundsException if invalid index is provided
         catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Invalid index entered ");
        }
        //handling NullPointerException if null array is provided
        catch (NullPointerException e){
            System.out.println("Array is null");
        }
    }
    //method takes array input from user
    public static void takeArray(int[]array,Scanner input){
        for(int i=0;i<array.length;i++){
            array[i]= input.nextInt();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter size of array :");
        int size= sc.nextInt();

        System.out.println("Enter array elements one by one :");
        int []numbers=new int[size];
        takeArray(numbers,sc);

        System.out.println("Enter the target index :");
        int index= sc.nextInt();

        //method call for find element
        findElement(numbers,index);

        //creating numbers array null for demonstrate null pointer exception
        numbers=null;
         findElement(numbers,index);
    }
}
