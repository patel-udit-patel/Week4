package org.example.annotations.intermediate_level.annotation_for_logging_method_execution_time;

class Task {
    @LogExecutionTime
    public void fastTask() {
        System.out.println("Executing fast task...");
    }

    @LogExecutionTime
    public void slowTask() {
        try {
            Thread.sleep(2000); // Simulate a long-running task
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Executing slow task...");
    }
}

