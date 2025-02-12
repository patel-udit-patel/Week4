package org.example.personalised_meal_plan_generator;
import java.util.ArrayList;
import java.util.List;

// Meal Plan Generator
class MealPlanGenerator {
    private List<Meal<? extends MealPlan>> mealPlans = new ArrayList<>();

    public void addMeal(Meal<? extends MealPlan> meal) {
        mealPlans.add(meal);
    }

    public void showAllMeals() {
        for (Meal<? extends MealPlan> meal : mealPlans) {
            meal.displayMealDetails();
        }
    }
}