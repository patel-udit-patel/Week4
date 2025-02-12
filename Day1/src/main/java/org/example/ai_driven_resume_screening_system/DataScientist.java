package org.example.ai_driven_resume_screening_system;
class DataScientist extends JobRole {
    public DataScientist() {
        super("Data Scientist");
    }

    @Override
    public String getRequiredSkills() {
        return "Python, Machine Learning, Statistics";
    }
}

