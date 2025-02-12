package org.example.list_interface.remove_duplicates_while_preserving_order;

import java.util.*;

public class RemoveDuplicates {

    public static <T> List<T> removeDuplicates(List<T> list) {
        Set<T> seen = new HashSet<>();
        List<T> result = new ArrayList<>();

        for (T item : list) {
            if (seen.add(item)) {
                // Adds only if the item is not in the set
                result.add(item);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        List<Integer> inputList = Arrays.asList(3, 1, 2, 2, 3, 4);
        System.out.println("Original List: " + inputList);

        List<Integer> uniqueList = removeDuplicates(inputList);
        System.out.println("List without Duplicates: " + uniqueList);
    }
}

