package org.fasttrackit;

import java.util.Scanner;

public class Game {
    Rescuer rescuer;
    Animal animal;
    Vet vet;

    private Animal[] animals = new Animal[2];

    public void start(){
        System.out.println("Let's start!");
        //initializeUser();
        initializeAnimals();
        displayAnimals();
        Animal selectedAnimal = getSelectedAnimalFromUser();
        System.out.println("Selected animal: " + selectedAnimal.getName());
    }

//    private String initializeUser() {
//        System.out.println("Please enter your name.");
//        Scanner scanner = new Scanner(System.in);
//        String player = rescuer.setName(scanner.nextLine());
//        return scanner.nextLine();
//    }

    private void initializeAnimals() {
        Animal dog = new Animal("Appel");
        dog.setAge(3);
        dog.setHealthLevel(3);
        dog.setHungerLevel(10);
        dog.setHappinessLevel(2);
        dog.setFavoriteFood("Meat");
        dog.setFavoriteActivity("Fetch");

        animals[0] = dog;

        Animal cat = new Animal("Pisi");
        cat.setAge(2);
        cat.setHealthLevel(4);
        cat.setHungerLevel(8);
        cat.setHappinessLevel(4);
        cat.setFavoriteFood("Fish");
        cat.setFavoriteActivity("Petting");

        animals[1] = cat;

    }

    private void displayAnimals() {
        System.out.println("This are the available animals: ");

        for (int i = 0; i<animals.length; i++){
            if (animals[i] != null) {
                System.out.println((i +1) + ". " + animals[i].getName());
            }
        }
    }

    private Animal getSelectedAnimalFromUser(){
        System.out.println("Please select an animal.");
        Scanner scanner = new Scanner(System.in);
        int animalNumber = scanner.nextInt();
        return animals[animalNumber -1];
    }
}
