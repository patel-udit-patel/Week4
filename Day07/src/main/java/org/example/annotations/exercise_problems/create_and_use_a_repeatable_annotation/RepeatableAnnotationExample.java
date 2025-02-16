package org.example.annotations.exercise_problems.create_and_use_a_repeatable_annotation;

import java.lang.reflect.Method;

public class RepeatableAnnotationExample {
    public static void main(String[] args) throws Exception {
        Method method = Software.class.getMethod("buggyMethod");

        if (method.isAnnotationPresent(BugReports.class)) {
            BugReports reports = method.getAnnotation(BugReports.class);
            for (BugReport report : reports.value()) {
                System.out.println("Bug: " + report.description());
            }
        }
    }
}
