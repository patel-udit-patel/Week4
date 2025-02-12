package org.example.ai_driven_resume_screening_system;

// Generic Resume Class
class Resume<T extends JobRole> {
    private T jobRole;
    private String candidateName;

    public Resume(String candidateName, T jobRole) {
        this.candidateName = candidateName;
        this.jobRole = jobRole;
    }

    public void displayResumeDetails() {
        System.out.println("Candidate: " + candidateName);
        System.out.println("Applying for: " + jobRole.getJobTitle());
        System.out.println("Required Skills: " + jobRole.getRequiredSkills());
    }
}

