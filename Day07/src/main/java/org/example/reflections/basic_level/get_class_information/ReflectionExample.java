package org.example.reflections.basic_level.get_class_information;

import java.lang.reflect.*;

public class ReflectionExample {
    public static void main(String[] args) throws ClassNotFoundException {
        // Example class, replace with user input
        String className = "java.util.ArrayList";
        Class<?> clazz = Class.forName(className);

        System.out.println("Class Name: " + clazz.getName());

        System.out.println("\nConstructors:");
        for (Constructor<?> constructor : clazz.getDeclaredConstructors()) {
            System.out.println(constructor);
        }

        System.out.println("\nFields:");
        for (Field field : clazz.getDeclaredFields()) {
            System.out.println(field);
        }

        System.out.println("\nMethods:");
        for (Method method : clazz.getDeclaredMethods()) {
            System.out.println(method);
        }
    }
}

