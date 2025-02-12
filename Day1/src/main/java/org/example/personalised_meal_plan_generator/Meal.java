package org.example.personalised_meal_plan_generator;

// Generic Meal Class
class Meal<T extends MealPlan> {
    private T mealPlan;

    public Meal(T mealPlan) {
        this.mealPlan = mealPlan;
    }

    public T getMealPlan() {
        return mealPlan;
    }

    public void displayMealDetails() {
        System.out.println("Meal Plan: " + mealPlan.getMealType());
    }
}
