package org.example.ai_driven_resume_screening_system;


// Main Class
public class AIResumeScreening {
    public static void main(String[] args) {
        Resume<SoftwareEngineer> softwareEngineerResume = new Resume<>("Alice", new SoftwareEngineer());
        Resume<DataScientist> dataScientistResume = new Resume<>("Bob", new DataScientist());
        Resume<ProductManager> productManagerResume = new Resume<>("Charlie", new ProductManager());

        ResumeScreeningSystem screeningSystem = new ResumeScreeningSystem();
        screeningSystem.addResume(softwareEngineerResume);
        screeningSystem.addResume(dataScientistResume);
        screeningSystem.addResume(productManagerResume);

        System.out.println("AI-Driven Resume Screening Results:");
        screeningSystem.showAllResumes();
    }
}
