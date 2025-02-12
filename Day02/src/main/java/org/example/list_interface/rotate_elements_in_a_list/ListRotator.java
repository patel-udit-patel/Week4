package org.example.list_interface.rotate_elements_in_a_list;

import java.util.*;

public class ListRotator {

    public static <T> List<T> rotateList(List<T> list, int positions) {
        int size = list.size();
        // Handle cases where positions > size
        positions = positions % size;

        List<T> rotatedList = new ArrayList<>();
        // Add elements from 'positions' to end
        rotatedList.addAll(list.subList(positions, size));
        // Add first 'positions' elements to the end
        rotatedList.addAll(list.subList(0, positions));

        return rotatedList;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(10, 20, 30, 40, 50);
        int rotateBy = 2;

        System.out.println("Original List: " + inputList);
        List<Integer> rotatedList = rotateList(inputList, rotateBy);
        System.out.println("Rotated List: " + rotatedList);
    }
}
