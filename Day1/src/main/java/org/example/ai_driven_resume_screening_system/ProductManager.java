package org.example.ai_driven_resume_screening_system;

class ProductManager extends JobRole {
    public ProductManager() {
        super("Product Manager");
    }

    @Override
    public String getRequiredSkills() {
        return "Market Analysis, Agile Methodologies, Leadership";
    }
}
