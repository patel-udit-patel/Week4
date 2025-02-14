package org.example.custom_exception;

//InvalidAgeException-> It is a custom made extends Exception
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}
