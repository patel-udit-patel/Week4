package org.example.ai_driven_resume_screening_system;

import java.util.ArrayList;
import java.util.List;

// Resume Screening System
class ResumeScreeningSystem {
    private List<Resume<? extends JobRole>> resumes = new ArrayList<>();

    public void addResume(Resume<? extends JobRole> resume) {
        resumes.add(resume);
    }

    public void showAllResumes() {
        for (Resume<? extends JobRole> resume : resumes) {
            resume.displayResumeDetails();
            System.out.println();
        }
    }
}
