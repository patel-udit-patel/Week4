package org.example.annotations.exercise_problems.create_and_use_a_repeatable_annotation;

import java.lang.annotation.*;

// Define Repeatable Annotation
@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@Repeatable(BugReports.class)
@interface BugReport {
    String description();
}
