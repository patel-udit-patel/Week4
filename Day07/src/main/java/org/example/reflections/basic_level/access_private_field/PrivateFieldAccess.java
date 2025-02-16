package org.example.reflections.basic_level.access_private_field;

import java.lang.reflect.Field;

public class PrivateFieldAccess {
    public static void main(String[] args) throws Exception {
        Person person = new Person();

        Field ageField = Person.class.getDeclaredField("age");
        ageField.setAccessible(true);

        System.out.println("Original Age: " + ageField.get(person));

        // Modify private field
        ageField.set(person, 30);

        System.out.println("Modified Age: " + ageField.get(person));
    }
}
