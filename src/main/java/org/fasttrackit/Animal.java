package org.fasttrackit;

public class Animal {
    private String name;
    private int age;
    private int healthLevel;
    private int hungerLevel;
    private int happinessLevel;
    private String favoriteFood;
    private String favoriteActivity;

    public Animal(String name) {
        this.name = name;
    }

    public void displayHappiness() {
        System.out.println("Happiness level for " + getName() + ": " + getHappinessLevel());
        if (getHappinessLevel()>5) {
            System.out.println(getName() + " is happy.");
        } else {
            System.out.println(getName() + " is not happy. You should play" + getFavoriteActivity() + " with " + getName() + ".");
        }
    }

    public String getName() {
        return name;
    }

    public String getFavoriteFood() {
        return favoriteFood;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getHealthLevel() {
        return healthLevel;
    }

    public void setHealthLevel(int healthLevel) {
        this.healthLevel = healthLevel;
    }

    public int getHungerLevel() {
        return hungerLevel;
    }

    public void setHungerLevel(int hungerLevel) {
        this.hungerLevel = hungerLevel;
    }

    public int getHappinessLevel() {
        return happinessLevel;
    }

    public void setHappinessLevel(int happinessLevel) {
        this.happinessLevel = happinessLevel;

    }

    public void setFavoriteFood(String favoriteFood) {
        this.favoriteFood = favoriteFood;
    }

    public String getFavoriteActivity() {
        return favoriteActivity;
    }

    public void setFavoriteActivity(String favoriteActivity) {
        this.favoriteActivity = favoriteActivity;
    }
}
