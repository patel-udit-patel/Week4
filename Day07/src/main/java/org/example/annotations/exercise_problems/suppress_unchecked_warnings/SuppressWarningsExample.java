package org.example.annotations.exercise_problems.suppress_unchecked_warnings;

import java.util.ArrayList;

public class SuppressWarningsExample {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList rawList = new ArrayList(); // No generics, warning suppressed
        rawList.add("Hello");
        rawList.add(10);

        System.out.println(rawList);
    }
}

