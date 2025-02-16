package org.example.reflections.basic_level.invoke_private_method;

import java.lang.reflect.*;

public class PrivateMethodInvoke {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        Method multiplyMethod = Calculator.class.getDeclaredMethod("multiply", int.class, int.class);
        multiplyMethod.setAccessible(true);

        int result = (int) multiplyMethod.invoke(calc, 5, 10);
        System.out.println("Multiplication Result: " + result);
    }
}

