package org.example.annotations.basic_level.create_a_todo_annotation_for_pending_task;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// Define custom annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface Todo {
    String task();

    String assignedTo();

    String priority() default "MEDIUM";
}
