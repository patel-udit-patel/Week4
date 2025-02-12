package org.example.set_interface.convert_set_to_a_sorted_list;

import java.util.*;

public class SetToSortedList {

    public static List<Integer> convertToSortedList(Set<Integer> set) {
        // Convert Set to List
        List<Integer> sortedList = new ArrayList<>(set);
        // Sort in ascending order
        Collections.sort(sortedList);
        return sortedList;
    }

    public static void main(String[] args) {
        Set<Integer> hashSet = new HashSet<>(Arrays.asList(5, 3, 9, 1));

        System.out.println("Original Set: " + hashSet);

        List<Integer> sortedList = convertToSortedList(hashSet);
        System.out.println("Sorted List: " + sortedList);
    }
}

