package org.fasttrackit;

import java.time.LocalDate;


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

        Game game = new Game();
        game.start();

//        //Rescuer
//        Rescuer rescuer = new Rescuer("Adi");
//        rescuer.setBudget(300.12);
//        rescuer.setAge(22);
//        rescuer.setGender("Male");
//
//        //Work
//        Work coder = new Work();
//        coder.setName("Programator");
//        coder.setDuration(7.5);
//        coder.setPlace("NTT");
//        coder.setSalary(8000);
//
//        //Food
//        Food food1 = new Food ("Meat");
//        food1.setPrice(22.1);
//        food1.setAvailability(true);
//        food1.setQuantity(2.5);
//        food1.setCompany("Petry");
//        food1.setOrigin("Cluj");
//        food1.setPremium(true);
//        food1.setExpirationDate(LocalDate.of(2021, 4, 10));
//
//        Food food2 = new Food ("Fish");
//        food2.setPrice(12.1);
//        food2.setAvailability(true);
//        food2.setQuantity(1.5);
//        food2.setCompany("Ocean");
//        food2.setOrigin("Norway");
//        food2.setPremium(false);
//        food1.setExpirationDate(LocalDate.of(2020, 8, 10));
//
//        //PlayTime
//        PlayTime playTime1 = new PlayTime();
//        playTime1.setName("Petting");
//        playTime1.setDuration(2.2);
//
//        PlayTime playTime2 = new PlayTime();
//        playTime2.setName("Scratch");
//        playTime2.setDuration(0.5);
//
//        //Rescued Animal
//        Animal dog = new Dog("Apple");
//        dog.setAge(3);
//        dog.setHealthLevel(3);
//        dog.setHungerLevel(10);
//        dog.setHappinessLevel(2);
//        dog.setFavoriteFood("Meat");
//        dog.setFavoriteActivity("Fetch");
//
//        Animal cat = new Cat ("Mitzi");
//        cat.setAge(2);
//        cat.setHealthLevel(4);
//        cat.setHungerLevel(8);
//        cat.setHappinessLevel(4);
//        cat.setFavoriteFood("Fish");
//        cat.setFavoriteActivity("Petting");
//
//        //Vet
//        Vet vet1 = new Vet("Geo");
//        vet1.setSpecialization("Dogs");
//        vet1.setPrice(80.2);
//        vet1.setAvailability(true);
//        vet1.setAge(45);
//        vet1.setExperience(20);
//
//        //Game
//        Game game1 = new Game();
//        game1.animal = dog;
//        game1.rescuer = rescuer;
//        game1.vet = vet1;
//        System.out.println("Rescuer name is: " + rescuer.getName());
//        //System.out.println("Vet name is: " + vet1.getName());
//
//        // dog actions
//        //rescuer.feeding(dog,food1);
//        //rescuer.playing(dog,playTime1);
//        //rescuer.feeding(dog,food2);
//        //rescuer.playing(dog,playTime2);
//        //dog.displayHappiness();
//
//        // cat actions
//        //rescuer.playing(cat,playTime2);
//        rescuer.playing(cat, playTime1);
//        rescuer.feeding(cat, food2);
//        //rescuer.feeding(cat, food1);
//        cat.displayHappiness();

    }
}
