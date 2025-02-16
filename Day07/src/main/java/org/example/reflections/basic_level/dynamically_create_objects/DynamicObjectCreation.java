package org.example.reflections.basic_level.dynamically_create_objects;

import java.lang.reflect.*;

public class DynamicObjectCreation {
    public static void main(String[] args) throws Exception {
        Class<?> studentClass = Class.forName("Student");

        Constructor<?> constructor = studentClass.getDeclaredConstructor();
        Object studentInstance = constructor.newInstance();

        Method showNameMethod = studentClass.getMethod("showName");
        showNameMethod.invoke(studentInstance);
    }
}

