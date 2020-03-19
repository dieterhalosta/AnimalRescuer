package org.fasttrackit;

public class Rescuer extends Human {
    private double budget;

    public Rescuer(String name) {
        super(name);
    }

    public double getBudget() {
        return budget;
    }

    public void setBudget(double budget) {
        this.budget = budget;
    }

    public void feeding (Animal animal, Food food) {
        System.out.println("-------------------------------------------------------------------------------");
        if (food.getName().equals(animal.getFavoriteFood())) {
            System.out.println(getName() + " just gave some " + food.getName() + " to " + animal.getName() + "!");
            animal.setHungerLevel(animal.getHungerLevel()-1);
            System.out.println(animal.getName() + "s hunger level is now: " + animal.getHungerLevel());
            animal.setHappinessLevel(animal.getHappinessLevel()+2);
            System.out.println(animal.getName() + "s happiness level is now: " + animal.getHappinessLevel());
            animal.setHealthLevel(animal.getHealthLevel()+1);
            System.out.println(animal.getName() + "s health level is now: " + animal.getHealthLevel());
        } else {
            System.out.println(getName() + " just gave some " + food.getName() + " to " + animal.getName() + "!");
            animal.setHungerLevel(animal.getHungerLevel()-1);
            System.out.println(animal.getName() + "s hunger level is now: " + animal.getHungerLevel());
            animal.setHappinessLevel(animal.getHappinessLevel()+1);
            System.out.println(animal.getName() + "s happiness level is now: " + animal.getHappinessLevel());
            animal.setHealthLevel(animal.getHealthLevel()+1);
            System.out.println(animal.getName() + "s health level is now: " + animal.getHealthLevel());
        }


    }

    public void playing (Animal animal, PlayTime playTime) {
        System.out.println("-------------------------------------------------------------------------------");
        if (playTime.getName().equals(animal.getFavoriteActivity())) {
            System.out.println(getName() + " just played some " + playTime.getName() + " with " + animal.getName() + "!");
            animal.setHappinessLevel(animal.getHappinessLevel()+2);
            System.out.println(animal.getName() + "s happiness level is now: " + animal.getHappinessLevel());
            animal.setHungerLevel(animal.getHungerLevel()-1);
            System.out.println(animal.getName() + "s hunger level is now: " + animal.getHungerLevel());
        } else {
            System.out.println(getName() + " just played some " + playTime.getName() + " with " + animal.getName() + "!");
            animal.setHappinessLevel(animal.getHappinessLevel()+1);
            System.out.println(animal.getName() + "s happiness level is now: " + animal.getHappinessLevel());
        }

    }
}
