package org.fasttrackit;

public class Supplies {
    private String name;
    private double price;
    private boolean availability;
    private String company;
    private boolean premium;

    public Supplies(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isAvailability() {
        return availability;
    }

    public void setAvailability(boolean availability) {
        this.availability = availability;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public boolean isPremium() {
        return premium;
    }

    public void setPremium(boolean premium) {
        this.premium = premium;
    }
}
