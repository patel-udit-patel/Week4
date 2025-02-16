package org.example.reflections.advanced_level.generate_json_representation;

import java.lang.reflect.Field;

public class JsonGenerator {
    public static String toJson(Object obj) throws Exception {
        StringBuilder json = new StringBuilder("{");

        Class<?> clazz = obj.getClass();
        Field[] fields = clazz.getDeclaredFields();

        for (int i = 0; i < fields.length; i++) {
            fields[i].setAccessible(true);
            String fieldName = fields[i].getName();
            Object value = fields[i].get(obj);

            json.append("\"").append(fieldName).append("\": ")
                    .append(value instanceof String ? "\"" + value + "\"" : value);

            if (i < fields.length - 1) json.append(", ");
        }

        json.append("}");
        return json.toString();
    }

    public static void main(String[] args) throws Exception {
        Person person = new Person();
        System.out.println(toJson(person));
    }
}

