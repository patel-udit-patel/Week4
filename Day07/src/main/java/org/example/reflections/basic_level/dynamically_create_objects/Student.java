package org.example.reflections.basic_level.dynamically_create_objects;

class Student {
    private String name;

    public Student() {
        this.name = "Default Student";
    }

    public void showName() {
        System.out.println("Student Name: " + name);
    }
}
