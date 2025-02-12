package org.example.multilevel_university_course_management_system;

// Generic Course Class
class Course<T extends CourseType> {
    private T courseType;

    public Course(T courseType) {
        this.courseType = courseType;
    }

    public T getCourseType() {
        return courseType;
    }

    public void displayCourseDetails() {
        System.out.println("Course: " + courseType.getCourseName() + ", Evaluation Method: " + courseType.getEvaluationMethod());
    }
}
