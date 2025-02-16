package org.example.annotations.exercise_problems.create_a_custom_annotation_and_use_it;

class TaskManager {
    @TaskInfo(priority = "High", assignedTo = "Udit Patel")
    public void completeTask() {
        System.out.println("Task completed.");
    }
}

