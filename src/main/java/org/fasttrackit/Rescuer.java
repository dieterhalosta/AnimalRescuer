package org.fasttrackit;

public class Rescuer extends Human {
    double budget;

    public Rescuer(String name) {
        super(name);
    }

    public void feeding (Animal animal, Food food) {
        System.out.println(getName() + " just gave some " + food.getName() + " to " + animal.getName() + "!");
        animal.hungerLevel--;
        System.out.println(animal.getName() + "s hunger level is now: " + animal.hungerLevel);
        animal.happinessLevel++;
        System.out.println(animal.getName() + "s happiness level is now: " + animal.happinessLevel);
        animal.healthLevel++;
        System.out.println(animal.getName() + "s health level is now: " + animal.healthLevel);
    }

    public void palying (Animal animal, PlayTime playTime) {
        System.out.println(getName() + " just played some " + playTime.name + " with " + animal.getName() + "!");
        animal.happinessLevel++;
        System.out.println(animal.getName() + "s happiness level is now: " + animal.happinessLevel);
        animal.hungerLevel++;
        System.out.println(animal.getName() + "s hunger level is now: " + animal.hungerLevel);
    }
}
