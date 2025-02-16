package org.example.annotations.basic_level.create_an_annotation_to_mark_important_methods;

class Feature {
    @ImportantMethod(level = "CRITICAL")
    public void criticalFeature() {
        System.out.println("Executing critical feature...");
    }

    @ImportantMethod
    public void highPriorityFeature() {
        System.out.println("Executing high-priority feature...");
    }

    public void normalFeature() {
        System.out.println("Executing normal feature...");
    }
}

