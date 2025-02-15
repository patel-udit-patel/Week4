package org.example.advanced_junit_practice_problems.testing_password_strength_validator;

public class PasswordValidator {

    // Method to validate password strength
    public boolean isValid(String password) {
        if (password == null) return false;

        // Check if password length is at least 8 characters
        if (password.length() < 8) return false;

        // Check if password contains at least one uppercase letter
        if (!password.matches(".*[A-Z].*")) return false;

        // Check if password contains at least one digit
        if (!password.matches(".*\\d.*")) return false;

        return true;
    }
}

