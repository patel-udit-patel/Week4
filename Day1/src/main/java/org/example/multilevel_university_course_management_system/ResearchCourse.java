package org.example.multilevel_university_course_management_system;

class ResearchCourse extends CourseType {
    public ResearchCourse(String courseName) {
        super(courseName);
    }

    @Override
    public String getEvaluationMethod() {
        return "Research-Based Evaluation";
    }
}
