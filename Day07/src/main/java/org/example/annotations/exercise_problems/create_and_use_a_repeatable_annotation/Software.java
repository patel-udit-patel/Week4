package org.example.annotations.exercise_problems.create_and_use_a_repeatable_annotation;

class Software {
    @BugReport(description = "Null pointer exception in edge case")
    @BugReport(description = "Performance issue in large datasets")
    public void buggyMethod() {
        System.out.println("Executing buggy method...");
    }
}

