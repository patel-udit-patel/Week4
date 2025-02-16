package org.example.annotations.intermediate_level.annotation_for_field_validation;

import java.lang.reflect.*;

class User {
    @MaxLength(10)
    private String username;

    public User(String username) throws Exception {
        this.username = username;
        validateLength();
    }

    private void validateLength() throws Exception {
        for (Field field : this.getClass().getDeclaredFields()) {
            if (field.isAnnotationPresent(MaxLength.class)) {
                field.setAccessible(true);
                String value = (String) field.get(this);
                int maxLength = field.getAnnotation(MaxLength.class).value();

                if (value.length() > maxLength) {
                    throw new IllegalArgumentException(
                            "Error: Field '" + field.getName() + "' exceeds max length of " + maxLength + " characters."
                    );
                }
            }
        }
    }

    public void showUsername() {
        System.out.println("Username: " + username);
    }
}

