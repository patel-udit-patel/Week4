package org.example.annotations.basic_level.create_a_todo_annotation_for_pending_task;

class Project {
    @Todo(task = "Implement login feature", assignedTo = "Udit Patel", priority = "HIGH")
    public void login() {}

    @Todo(task = "Refactor database module", assignedTo = "Amit Sharma")
    public void refactorDatabase() {}

    @Todo(task = "Optimize API response time", assignedTo = "Priya Singh", priority = "CRITICAL")
    public void optimizeAPI() {}

    public void completedFeature() {}
}

