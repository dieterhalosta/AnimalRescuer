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

        Work coder = new Work();
        coder.name = "Programator";
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

        Dog dog = new Dog("Apple");
        dog.age = 3;
        dog.healthLevel = 2;
        dog.hungerLevel = 10;
        dog.happinessLevel = 1;
        dog.favoriteFood = food1;
        dog.favoriteActivity = playTime1;

        Vet vet1 = new Vet("Geo");
        vet1.specialization = "Dogs";
        vet1.price = 80.2;
        vet1.availability = true;
        vet1.age = 45;
        vet1.experience = 20;

        Game game1 = new Game();
        game1.animal = dog;
        game1.rescuer = rescuer;
        game1.vet = vet1;
        System.out.println("Rescuer name is: " + rescuer.getName());
        System.out.println("Vet name is: " + vet1.getName());
        System.out.println("Animal food is: " + food1.getName());
        rescuer.feeding(dog,food1);
        rescuer.palying(dog,playTime1);
    }
}
