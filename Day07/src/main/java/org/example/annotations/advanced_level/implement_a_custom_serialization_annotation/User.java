package org.example.annotations.advanced_level.implement_a_custom_serialization_annotation;

class User {
    @JsonField(name = "user_name")
    private String name;

    @JsonField(name = "user_age")
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
}

