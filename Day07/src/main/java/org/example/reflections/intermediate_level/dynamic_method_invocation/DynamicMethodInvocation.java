package org.example.reflections.intermediate_level.dynamic_method_invocation;

import java.lang.reflect.Method;
import java.util.Scanner;

public class DynamicMethodInvocation {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter method name (add/subtract/multiply): ");
        String methodName = scanner.nextLine();

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();

        //Get MathOperations class and method dynamically
        Class<?> clazz = MathOperations.class;
        Method method = clazz.getMethod(methodName, int.class, int.class);

        //Create an instance of MathOperations and invoke the method
        Object instance = clazz.getDeclaredConstructor().newInstance();
        Object result = method.invoke(instance, num1, num2);

        System.out.println("Result: " + result);
    }
}

