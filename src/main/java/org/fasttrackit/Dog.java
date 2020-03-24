package org.fasttrackit;

public class Dog extends Animal {
    private int legs;

    public Dog(String name) {
        super(name);
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public void displayHappiness() {
        System.out.println("Happiness level for " + getName() + ": " + getHappinessLevel());
        if (getHappinessLevel()>5) {
            System.out.println(getName() + " is shaking the tail.");
        } else {
            System.out.println(getName() + " is not happy. You should play" + getFavoriteActivity() + " with " + getName() + ".");
        }
    }
}
