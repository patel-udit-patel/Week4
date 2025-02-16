package org.example.reflections.advanced_level.create_a_custom_object_mapper;

class User {
    private String name;
    private int age;

    @Override
    public String toString() {
        return "User{name='" + name + "', age=" + age + "}";
    }
}
