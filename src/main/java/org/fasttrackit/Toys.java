package org.fasttrackit;

public class Toys extends Supplies {
    private boolean damaged;

    public Toys(String name) {
        super(name);
    }

    public boolean isDamaged() {
        return damaged;
    }

    public void setDamaged(boolean damaged) {
        this.damaged = damaged;
    }
}
