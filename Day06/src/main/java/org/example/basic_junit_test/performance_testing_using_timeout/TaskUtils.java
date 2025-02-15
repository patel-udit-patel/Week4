package org.example.basic_junit_test.performance_testing_using_timeout;

public class TaskUtils {
    public String longRunningTask() throws InterruptedException {
        // Simulate a task that takes 3 seconds to complete
        Thread.sleep(3000);  // 3000 milliseconds = 3 seconds
        return "Task Completed";
    }
}

