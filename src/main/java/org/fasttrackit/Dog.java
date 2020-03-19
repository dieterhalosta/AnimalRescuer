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
}
