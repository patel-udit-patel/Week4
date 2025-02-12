package org.example.multilevel_university_course_management_system;
import java.util.ArrayList;
import java.util.List;

// Course Management System
class CourseManagement {
    private List<Course<? extends CourseType>> courses = new ArrayList<>();

    public void addCourse(Course<? extends CourseType> course) {
        courses.add(course);
    }

    public void showAllCourses() {
        for (Course<? extends CourseType> course : courses) {
            course.displayCourseDetails();
        }
    }
}
