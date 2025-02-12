package org.example.set_interface.symmetric_difference;

import java.util.*;

public class SymmetricDifference {

    public static <T> Set<T> symmetricDifference(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        Set<T> intersection = new HashSet<>();

        for (T element : set2) {
            // If element is already present, it's in both sets
            if (!result.add(element)) {
                intersection.add(element);
            }
        }

        // Remove intersection elements to get symmetric difference
        result.removeAll(intersection);
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> symDiff = symmetricDifference(set1, set2);
        System.out.println("Symmetric Difference: " + symDiff);
    }
}

