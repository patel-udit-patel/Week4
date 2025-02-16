package org.example.annotations.advanced_level.implement_a_custom_caching_system;

// Cache Execution Handler
public class CachingExample {
    public static void main(String[] args) throws Exception {
        MathService service = new MathService();

        System.out.println("Factorial of 5: " + service.factorial(5));
        System.out.println("Factorial of 5 (cached): " + service.factorial(5));
    }
}
