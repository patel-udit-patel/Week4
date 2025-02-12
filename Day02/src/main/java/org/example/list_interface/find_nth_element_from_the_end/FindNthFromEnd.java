package org.example.list_interface.find_nth_element_from_the_end;

import java.util.*;

public class FindNthFromEnd {

    public static <T> T findNthFromEnd(LinkedList<T> list, int n) {
        Iterator<T> fast = list.iterator();
        Iterator<T> slow = list.iterator();

        // Move fast pointer n steps ahead
        for (int i = 0; i < n; i++) {
            if (!fast.hasNext()) {
                throw new IllegalArgumentException("N is larger than the list size");
            }
            fast.next();
        }

        // Move both pointers until fast reaches the end
        while (fast.hasNext()) {
            fast.next();
            slow.next();
        }
// The Nth element from the end
        return slow.next();
    }

    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>(Arrays.asList("A", "B", "C", "D", "E"));
        int n = 2;

        System.out.println("Original List: " + list);
        String nthFromEnd = findNthFromEnd(list, n);
        System.out.println("Nth Element from End: " + nthFromEnd);
    }
}

