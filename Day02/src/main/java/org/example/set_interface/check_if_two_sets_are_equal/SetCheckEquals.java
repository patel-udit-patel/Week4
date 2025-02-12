package org.example.set_interface.check_if_two_sets_are_equal;

import java.util.*;

public class SetCheckEquals {

    public static <T> boolean areSetsEqual(Set<T> set1, Set<T> set2) {
        // If sizes are different, sets are not equal
        if (set1.size() != set2.size()) {
            return false;
        }

        // Check if every element in set1 exists in set2
        for (T element : set1) {
            if (!set2.contains(element)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 2, 1));
        Set<Integer> set3 = new HashSet<>(Arrays.asList(1, 2, 4));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Are sets equal? " + areSetsEqual(set1, set2));

        System.out.println("\nSet1: " + set1);
        System.out.println("Set3: " + set3);
        System.out.println("Are sets equal? " + areSetsEqual(set1, set3));
    }
}
