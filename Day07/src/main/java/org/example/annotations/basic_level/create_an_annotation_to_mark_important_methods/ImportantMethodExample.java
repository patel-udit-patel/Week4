package org.example.annotations.basic_level.create_an_annotation_to_mark_important_methods;

import java.lang.reflect.Method;

public class ImportantMethodExample {
    public static void main(String[] args) throws Exception {
        Method[] methods = Feature.class.getDeclaredMethods();

        for (Method method : methods) {
            if (method.isAnnotationPresent(ImportantMethod.class)) {
                ImportantMethod annotation = method.getAnnotation(ImportantMethod.class);
                System.out.println("Method: " + method.getName() + " | Level: " + annotation.level());
            }
        }
    }
}
