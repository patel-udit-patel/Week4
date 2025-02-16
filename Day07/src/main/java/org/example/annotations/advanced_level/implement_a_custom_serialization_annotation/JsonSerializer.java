package org.example.annotations.advanced_level.implement_a_custom_serialization_annotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class JsonSerializer {
    public static String toJson(Object obj) throws Exception {
        Map<String, String> jsonMap = new HashMap<>();
        Class<?> clazz = obj.getClass();

        for (Field field : clazz.getDeclaredFields()) {
            if (field.isAnnotationPresent(JsonField.class)) {
                field.setAccessible(true);
                String key = field.getAnnotation(JsonField.class).name();
                String value = field.get(obj).toString();
                jsonMap.put("\"" + key + "\"", "\"" + value + "\"");
            }
        }

        return "{" + String.join(", ", jsonMap.entrySet()) + "}";
    }

    public static void main(String[] args) throws Exception {
        User user = new User("JohnDoe", 28);
        System.out.println(toJson(user));
    }
}
