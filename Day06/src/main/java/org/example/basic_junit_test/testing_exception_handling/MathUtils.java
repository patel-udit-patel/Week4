package org.example.basic_junit_test.testing_exception_handling;

public class MathUtils {
    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero is not allowed.");
        }
        return a / b;
    }
}

