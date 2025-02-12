package org.example.set_interface.union_and_intersection_of_two_sets;

import java.util.*;
public class UnionAndIntersection {

    public static <T> Set<T> union(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>(set1);
        // Add all elements from set2
        result.addAll(set2);
        return result;
    }

    public static <T> Set<T> intersection(Set<T> set1, Set<T> set2) {
        Set<T> result = new HashSet<>();
        for (T element : set1) {
            if (set2.contains(element)) {
                // Add only if present in both sets
                result.add(element);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Set<Integer> set1 = new HashSet<>(Arrays.asList(1, 2, 3));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3, 4, 5));

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);

        Set<Integer> unionSet = union(set1, set2);
        System.out.println("Union: " + unionSet);

        Set<Integer> intersectionSet = intersection(set1, set2);
        System.out.println("Intersection: " + intersectionSet);
    }
}
