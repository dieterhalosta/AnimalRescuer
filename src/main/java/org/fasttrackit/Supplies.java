package org.fasttrackit;

public class Supplies {
    private String name;
    double price;
    boolean availability;
    String company;
    boolean premium;

    public Supplies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

}
