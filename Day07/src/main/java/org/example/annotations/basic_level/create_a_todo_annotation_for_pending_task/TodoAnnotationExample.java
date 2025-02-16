package org.example.annotations.basic_level.create_a_todo_annotation_for_pending_task;

import java.lang.reflect.Method;

public class TodoAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method[] methods = Project.class.getDeclaredMethods();

        System.out.println("Pending Tasks:");
        for (Method method : methods) {
            if (method.isAnnotationPresent(Todo.class)) {
                Todo annotation = method.getAnnotation(Todo.class);
                System.out.println("Method: " + method.getName() +
                        " | Task: " + annotation.task() +
                        " | Assigned To: " + annotation.assignedTo() +
                        " | Priority: " + annotation.priority());
            }
        }
    }
}
