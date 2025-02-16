package org.example.annotations.intermediate_level.annotation_for_logging_method_execution_time;

import java.lang.reflect.Method;

public class ExecutionTimeLogger {
    public static void main(String[] args) throws Exception {
        Task task = new Task();

        for (Method method : Task.class.getDeclaredMethods()) {
            if (method.isAnnotationPresent(LogExecutionTime.class)) {
                long startTime = System.nanoTime();
                method.invoke(task);
                long endTime = System.nanoTime();

                System.out.println("Execution time of " + method.getName() + ": " + (endTime - startTime) / 1_000_000.0 + " ms\n");
            }
        }
    }
}
