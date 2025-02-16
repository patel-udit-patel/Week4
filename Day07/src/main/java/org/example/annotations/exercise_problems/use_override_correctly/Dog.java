package org.example.annotations.exercise_problems.use_override_correctly;

class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog barks.");
    }
}
