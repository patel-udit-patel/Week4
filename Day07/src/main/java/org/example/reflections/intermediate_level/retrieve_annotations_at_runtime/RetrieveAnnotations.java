package org.example.reflections.intermediate_level.retrieve_annotations_at_runtime;

public class RetrieveAnnotations {
    public static void main(String[] args) {
        Class<SampleClass> clazz = SampleClass.class;

        if (clazz.isAnnotationPresent(Author.class)) {
            Author annotation = clazz.getAnnotation(Author.class);
            System.out.println("Author: " + annotation.name());
        } else {
            System.out.println("No @Author annotation found.");
        }
    }
}

