package org.example.annotations.exercise_problems.create_a_custom_annotation_and_use_it;

import java.lang.reflect.Method;

public class CustomAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method = TaskManager.class.getMethod("completeTask");

        if (method.isAnnotationPresent(TaskInfo.class)) {
            TaskInfo annotation = method.getAnnotation(TaskInfo.class);
            System.out.println("Priority: " + annotation.priority());
            System.out.println("Assigned To: " + annotation.assignedTo());
        }
    }
}
