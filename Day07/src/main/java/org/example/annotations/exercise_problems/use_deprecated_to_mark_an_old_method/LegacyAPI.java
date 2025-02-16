package org.example.annotations.exercise_problems.use_deprecated_to_mark_an_old_method;

class LegacyAPI {
    @Deprecated
    public void oldFeature() {
        System.out.println("This is an old feature and should not be used.");
    }

    public void newFeature() {
        System.out.println("This is the new recommended feature.");
    }
}

