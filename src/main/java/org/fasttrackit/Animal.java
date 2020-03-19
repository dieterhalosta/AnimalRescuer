package org.fasttrackit;

public class Animal {
    private String name;
    int age;
    int healthLevel;
    int hungerLevel;
    int happinessLevel;
    String favoriteFood;
    String favoriteActivity;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }
}
