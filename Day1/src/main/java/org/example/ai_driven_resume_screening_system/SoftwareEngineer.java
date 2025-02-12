package org.example.ai_driven_resume_screening_system;

// Specific Job Roles
class SoftwareEngineer extends JobRole {
    public SoftwareEngineer() {
        super("Software Engineer");
    }

    @Override
    public String getRequiredSkills() {
        return "Java, Python, Data Structures, Algorithms";
    }
}