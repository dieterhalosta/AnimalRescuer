package org.fasttrackit;

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

        Rescuer rescuer = new Rescuer();
        rescuer.name = "Adi";
        rescuer.budget = 300.12;
        rescuer.age = 22;
        rescuer.gender = "Male";

        Food food1 = new Food ();
        food1.name = "Carne";
        food1.price = 22.1;
        food1.availability = true;
        food1.quantity = 2.5;
        food1.company = "Petry";
        food1.origin = "Cluj";
        food1.premium = false;
        food1.expirationDate = new Date(2020, 04, 22);

        PlayTime playTime1 = new PlayTime();
        playTime1.name = "Fetch";
        playTime1.duration = 2.2;

        Animal animal = new Animal();
        animal.name = "Apple";
        animal.age = 3;
        animal.healthLevel = 2;
        animal.hungerLevel = 2;
        animal.happinessLevel = 2;
        animal.favoriteFood = food1;
        animal.favoriteActivity = playTime1;

        Vet vet1 = new Vet();
        vet1.name = "Geo";
        vet1.specialization = "Dogs";
        vet1.price = 80.2;
        vet1.availability = true;
        vet1.age = 45;
        vet1.experience = 20;

        Game game1 = new Game();
        game1.animal = animal;
        game1.rescuer = rescuer;
        game1.vet = vet1;

    }
}
