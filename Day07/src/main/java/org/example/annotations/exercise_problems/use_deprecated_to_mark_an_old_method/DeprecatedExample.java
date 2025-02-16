package org.example.annotations.exercise_problems.use_deprecated_to_mark_an_old_method;

public class DeprecatedExample {
    public static void main(String[] args) {
        LegacyAPI api = new LegacyAPI();
        // Warning: The method is deprecated
        api.oldFeature();
        api.newFeature();
    }
}
