package org.fasttrackit;

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

        Food food1 = new Food ();
        food1.name = "Carne";
        food1.price = 22.1;
        food1.availability = true;

        PlayTime playTime1 = new PlayTime();
        playTime1.name = "Fetch";

        Animal animal = new Animal();
        animal.name = "Apple";
        animal.age = 3;
        animal.healthLevel = 2;
        animal.hungerLevel = 2;
        animal.happiness = 2;
        animal.food = food1;
        animal.playTime = playTime1;

        Vet vet1 = new Vet();
        vet1.name = "Geo";
        vet1.specialization = "Dogs";

        Game game1 = new Game();
        game1.animal = animal;
        game1.rescuer = rescuer;
        game1.vet = vet1;

    }
}
