package org.example.list_interface.reverse_a_list;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.LinkedList;

public class ReverseArrayList {

    //Reverse an ArrayList
    public static <T> List<T> reverseArrayList(List<T> list) {
        List<T> reversedList = new ArrayList<>(list.size());
        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }
        return reversedList;
    }

    //Reverse a LinkedList
    public static <T> LinkedList<T> reverseLinkedList(LinkedList<T> list) {
        LinkedList<T> reversedList = new LinkedList<>();
        for (T item : list) {
            reversedList.addFirst(item); // Adds at the beginning, reversing the order
        }
        return reversedList;
    }
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);

        //Example with ArrayList
        System.out.println("Enter size of arraylist");
        int size=input.nextInt();
        List<Integer> arrayList = new ArrayList<>(size);
        System.out.println("Enter elements of arraylist");
        for(int i=0;i<size;i++){
            arrayList.add(input.nextInt());
        }
        System.out.println("Original ArrayList: " + arrayList);
        List<Integer> reversedArrayList = reverseArrayList(arrayList);
        System.out.println("Reversed ArrayList: " + reversedArrayList);

        //Example with LinkedList
        LinkedList<Integer> linkedList = new LinkedList<>();
        System.out.println("Enter elements of linked list");
        for (int i=0;i<size;i++){
            linkedList.add(input.nextInt());
        }
        System.out.println("\nOriginal LinkedList: " + linkedList);
        LinkedList<Integer> reversedLinkedList = reverseLinkedList(linkedList);
        System.out.println("Reversed LinkedList: " + reversedLinkedList);
    }
}
