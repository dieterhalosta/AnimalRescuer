package org.fasttrackit;

public class Rescuer extends Human {
    double budget;

    public Rescuer(String name) {
        super(name);
    }

    public void feeding (Animal animal, Food food) {
        System.out.println("-------------------------------------------------------------------------------");
        if (food.getName().equals(animal.getFavoriteFood())) {
            System.out.println(getName() + " just gave some " + food.getName() + " to " + animal.getName() + "!");
            animal.hungerLevel-=2;
            System.out.println(animal.getName() + "s hunger level is now: " + animal.hungerLevel);
            animal.happinessLevel+=2;
            System.out.println(animal.getName() + "s happiness level is now: " + animal.happinessLevel);
            animal.healthLevel++;
            System.out.println(animal.getName() + "s health level is now: " + animal.healthLevel);
        }
            System.out.println(getName() + " just gave some " + food.getName() + " to " + animal.getName() + "!");
            animal.hungerLevel--;
            System.out.println(animal.getName() + "s hunger level is now: " + animal.hungerLevel);
            animal.happinessLevel++;
            System.out.println(animal.getName() + "s happiness level is now: " + animal.happinessLevel);
            animal.healthLevel++;
            System.out.println(animal.getName() + "s health level is now: " + animal.healthLevel);

    }

    public void playing (Animal animal, PlayTime playTime) {
        System.out.println("-------------------------------------------------------------------------------");
        if (playTime.getName().equals(animal.getFavoriteActivity())) {
            System.out.println(getName() + " just played some " + playTime.name + " with " + animal.getName() + "!");
            animal.happinessLevel+=2;
            System.out.println(animal.getName() + "s happiness level is now: " + animal.happinessLevel);
            animal.hungerLevel++;
            System.out.println(animal.getName() + "s hunger level is now: " + animal.hungerLevel);
        }
            System.out.println(getName() + " just played some " + playTime.name + " with " + animal.getName() + "!");
            animal.happinessLevel++;
            System.out.println(animal.getName() + "s happiness level is now: " + animal.happinessLevel);

    }
}
