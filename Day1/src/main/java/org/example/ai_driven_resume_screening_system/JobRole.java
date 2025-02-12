package org.example.ai_driven_resume_screening_system;
// Abstract Job Role Class
abstract class JobRole {
    private String jobTitle;

    public JobRole(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public abstract String getRequiredSkills();
}

