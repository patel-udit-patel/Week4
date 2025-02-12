package org.example.multilevel_university_course_management_system;


// Main Class
public class UniversitySystem {
    public static void main(String[] args) {
        Course<ExamCourse> examCourse = new Course<>(new ExamCourse("Mathematics"));
        Course<AssignmentCourse> assignmentCourse = new Course<>(new AssignmentCourse("Literature"));
        Course<ResearchCourse> researchCourse = new Course<>(new ResearchCourse("Physics"));

        CourseManagement courseManagement = new CourseManagement();
        courseManagement.addCourse(examCourse);
        courseManagement.addCourse(assignmentCourse);
        courseManagement.addCourse(researchCourse);

        System.out.println("University Course List:");
        courseManagement.showAllCourses();
    }
}