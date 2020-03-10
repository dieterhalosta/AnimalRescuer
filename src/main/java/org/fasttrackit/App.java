package org.fasttrackit;

import java.time.LocalDate;
import java.util.Date;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println("----------------------------------");
        System.out.println( "Welcome to the AnimalRescuer!" );
        System.out.println("----------------------------------");

        Rescuer rescuer = new Rescuer("Adi");
        rescuer.budget = 300.12;
        rescuer.age = 22;
        rescuer.gender = "Male";

        Work coder = new Work("Programator");
        coder.duration = 7.5;
        coder.place = "NTT";
        coder.salary = 8000;

        Food food1 = new Food ("Carne");
        food1.price = 22.1;
        food1.availability = true;
        food1.quantity = 2.5;
        food1.company = "Petry";
        food1.origin = "Cluj";
        food1.premium = false;
        food1.expirationDate = LocalDate.of(2020, 2, 10);

        PlayTime playTime1 = new PlayTime();
        playTime1.name = "Fetch";
        playTime1.duration = 2.2;

        Animal animal = new Animal();
        animal.name = "Apple";
        animal.age = 3;
        animal.healthLevel = 2;
        animal.hungerLevel = 10;
        animal.happinessLevel = 1;
        animal.favoriteFood = food1;
        animal.favoriteActivity = playTime1;

        Vet vet1 = new Vet("Geo");
        vet1.specialization = "Dogs";
        vet1.price = 80.2;
        vet1.availability = true;
        vet1.age = 45;
        vet1.experience = 20;

        Game game1 = new Game();
        game1.animal = animal;
        game1.rescuer = rescuer;
        game1.vet = vet1;
        System.out.println("Rescuer name is: " + rescuer.getName());
        System.out.println("Vet name is: " + vet1.getName());
        System.out.println("Rescuer works as: " + coder.getName());
        System.out.println("Animal food is: " + food1.getName());
        rescuer.feeding(animal,food1);
        rescuer.palying(animal,playTime1);
    }
}
