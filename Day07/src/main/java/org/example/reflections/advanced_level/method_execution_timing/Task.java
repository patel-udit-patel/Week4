package org.example.reflections.advanced_level.method_execution_timing;

class Task {
    public void longRunningTask() {
        try {
            Thread.sleep(2000); // Simulate a task taking 2 seconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
