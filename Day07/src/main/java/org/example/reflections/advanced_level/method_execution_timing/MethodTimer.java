package org.example.reflections.advanced_level.method_execution_timing;

import java.lang.reflect.Method;

public class MethodTimer {
    public static void measureExecutionTime(Object obj, String methodName) throws Exception {
        Method method = obj.getClass().getMethod(methodName);

        long startTime = System.nanoTime();
        method.invoke(obj);
        long endTime = System.nanoTime();

        System.out.println("Execution time of " + methodName + ": " + (endTime - startTime) / 1_000_000 + " ms");
    }

    public static void main(String[] args) throws Exception {
        Task task = new Task();
        measureExecutionTime(task, "longRunningTask");
    }
}

