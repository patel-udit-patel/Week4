package org.example.reflections.intermediate_level.access_and_modify_static_fields;

import java.lang.reflect.Field;

public class ModifyStaticField {
    public static void main(String[] args) throws Exception {
        Class<Configuration> clazz = Configuration.class;

        //Access private static field
        Field apiKeyField = clazz.getDeclaredField("API_KEY");
        apiKeyField.setAccessible(true);

        //Modify the static field
        apiKeyField.set(null, "NEW_SECURE_KEY");

        //Print the updated value
        System.out.println("Updated API Key: " + Configuration.getApiKey());
    }
}
