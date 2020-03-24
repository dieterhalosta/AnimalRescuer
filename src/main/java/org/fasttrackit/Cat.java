package org.fasttrackit;

public class Cat extends Animal {

    public Cat(String name) {
        super(name);
    }

    public void displayHappiness() {
        System.out.println("Happiness level for " + getName() + ": " + getHappinessLevel());
        if (getHappinessLevel()>5) {
            System.out.println(getName() + " is purring.");
        } else {
            System.out.println(getName() + " is not happy. You should play" + getFavoriteActivity() + " with " + getName() + ".");
        }
    }
}
