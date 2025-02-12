package org.example.personalised_meal_plan_generator;

// Main Class
public class PersonalisedMealPlan {
    public static void main(String[] args) {
        Meal<VegetarianMeal> vegetarianMeal = new Meal<>(new VegetarianMeal());
        Meal<VeganMeal> veganMeal = new Meal<>(new VeganMeal());
        Meal<HighProteinMeal> highProteinMeal = new Meal<>(new HighProteinMeal());

        MealPlanGenerator mealPlanGenerator = new MealPlanGenerator();
        mealPlanGenerator.addMeal(vegetarianMeal);
        mealPlanGenerator.addMeal(veganMeal);
        mealPlanGenerator.addMeal(highProteinMeal);

        System.out.println("Personalized Meal Plans:");
        mealPlanGenerator.showAllMeals();
    }
}