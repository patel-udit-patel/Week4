package org.example.annotations.intermediate_level.annotation_for_field_validation;

public class MaxLengthExample {
    public static void main(String[] args) {
        try {
            User validUser = new User("JohnDoe");
            validUser.showUsername();

            User invalidUser = new User("ThisNameIsTooLong"); // Throws Exception
            invalidUser.showUsername();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
