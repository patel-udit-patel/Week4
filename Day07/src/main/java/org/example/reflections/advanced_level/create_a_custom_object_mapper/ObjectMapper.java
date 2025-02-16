package org.example.reflections.advanced_level.create_a_custom_object_mapper;

import java.lang.reflect.Field;
import java.util.Map;

public class ObjectMapper {
    public static <T> T toObject(Class<T> clazz, Map<String, Object> properties) throws Exception {
        T instance = clazz.getDeclaredConstructor().newInstance();

        for (Map.Entry<String, Object> entry : properties.entrySet()) {
            String fieldName = entry.getKey();
            Object value = entry.getValue();

            Field field = clazz.getDeclaredField(fieldName);
            field.setAccessible(true);
            field.set(instance, value);
        }

        return instance;
    }

    public static void main(String[] args) throws Exception {
        Map<String, Object> userData = Map.of("name", "John Doe", "age", 30);
        User user = toObject(User.class, userData);
        System.out.println(user);
    }
}

