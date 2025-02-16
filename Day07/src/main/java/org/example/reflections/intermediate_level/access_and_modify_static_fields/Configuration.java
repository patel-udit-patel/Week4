package org.example.reflections.intermediate_level.access_and_modify_static_fields;

class Configuration {
    private static String API_KEY = "OLD_KEY";

    public static String getApiKey() {
        return API_KEY;
    }
}
