package org.fasttrackit;

public class Animal {
    private String name;
    int age;
    int healthLevel;
    int hungerLevel;
    int happinessLevel;
    Food favoriteFood;
    PlayTime favoriteActivity;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
