package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

public class Food extends Supplies{
    LocalDate expirationDate;
    double quantity;
    String origin;

    public Food(String name) {
        super(name);
    }
}
