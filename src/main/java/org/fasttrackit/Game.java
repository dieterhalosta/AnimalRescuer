package org.fasttrackit;

import org.fasttrackit.utils.ScannerUtils;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;

public class Game {
    private Animal[] animals = new Animal[2];
    private List<Food> availableFood = new ArrayList<Food>();
    private PlayTime[] availableActivities = new PlayTime[4];
    private Animal selectedAnimal;
    private Rescuer player;


    public void start(){

        initializeAnimals();
        initializeUser();
        displayAnimals();
        selectedAnimal = getSelectedAnimalFromUser();
        String userAnimalName = setAnimalName();
        selectedAnimal.setName(userAnimalName);
        System.out.println(selectedAnimal.getName() + "'s status: \nHappiness Level: " + selectedAnimal.getHappinessLevel() + "\nHunger Level: " + selectedAnimal.getHungerLevel());
        initFood();
        initActivities();


        while (selectedAnimal.getHappinessLevel() < 10 && selectedAnimal.getHungerLevel() > 0) {
            requireFeeding();
            requireActivity();
        }

    }

    private void initializeAnimals() {
        Animal dog = new Animal("Dog");
        dog.setAge(3);
        dog.setHealthLevel(3);
        dog.setHungerLevel(10);
        dog.setHappinessLevel(2);
        dog.setFavoriteFood("Meat");
        dog.setFavoriteActivity("Fetch");
        animals[0] = dog;

        Animal cat = new Animal("Cat");
        cat.setAge(2);
        cat.setHealthLevel(4);
        cat.setHungerLevel(8);
        cat.setHappinessLevel(4);
        cat.setFavoriteFood("Fish");
        cat.setFavoriteActivity("Petting");
        animals[1] = cat;

    }

    private void initializeUser() {
        System.out.println("Please enter your name.");
        try {
            String playerName = ScannerUtils.nextLine();
            Rescuer player = new Rescuer(playerName);
            System.out.println("Hello " + player.getName());
        } catch (InputMismatchException e) {
            throw new RuntimeException("Please enter a valid name");
        }

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
        int animalNumber = ScannerUtils.nextSingleInt();
        return animals[animalNumber -1];
    }

    private String setAnimalName() {
        System.out.println("Please enter a name for your animal.");
        return  ScannerUtils.nextLine();
    }


    private void initFood() {
       Food meat = new Food ("Meat");
       meat.setExpirationDate(LocalDate.of(2020, 8, 10));
       meat.setOrigin("Covasna");
       meat.setCompany("Perty");
       meat.setAvailability(true);
       meat.setQuantity(4.1);
       meat.setPremium(true);
       meat.setPrice(45.86);
       availableFood.add(meat);

       Food purina = new Food ("Fish");
        purina.setExpirationDate(LocalDate.of(2020, 8, 10));
        purina.setOrigin("Norway");
        purina.setCompany("Ocean");
        purina.setAvailability(true);
        purina.setQuantity(1.5);
        purina.setPremium(false);
        purina.setPrice(12.1);
        availableFood.add(purina);

    }

    private void displayFoods() {
        System.out.println("This are the available foods: ");

        for (Food food : availableFood){
            if (food.getName() != null) {
                System.out.println(food.getName());
            }
        }
    }

    private void initActivities(){
        PlayTime fetch = new PlayTime();
        fetch.setName("Fetch");
        fetch.setDuration(2.3);
        availableActivities[0] = fetch;

        PlayTime petting = new PlayTime();
        petting.setName("Petting");
        petting.setDuration(3.1);
        availableActivities[1] = petting;

        PlayTime scratch = new PlayTime();
        scratch.setName("Scratch");
        scratch.setDuration(2.1);
        availableActivities[2] = scratch;

        PlayTime mouseCatch = new PlayTime();
        mouseCatch.setName("Mouse Catching");
        mouseCatch.setDuration(1.1);
        availableActivities[3] = mouseCatch;

    }

    private void displayActivities() {
        System.out.println("This are the available activities: ");

        for (int i = 0; i<availableActivities.length; i++){
            if (availableActivities[i] != null) {
                System.out.println((i +1) + ". " + availableActivities[i].getName());
            }
        }
    }

    private Food getSelectedFoodFromUser(){
        System.out.println("Select one of the foods.");
        int selectedF = ScannerUtils.nextSingleInt();
        return availableFood.get(selectedF - 1);

    }

    private PlayTime getSelectedActivityFromUser(){
        System.out.println("Select one of the activities.");
        int selectedA = ScannerUtils.nextSingleInt();
        return availableActivities[selectedA -1];

    }

    private void requireFeeding() {
            System.out.println("Please feed " + selectedAnimal.getName());
            displayFoods();
            Food selectedFood = getSelectedFoodFromUser();
            System.out.println(selectedFood.getName());
            player.feeding(selectedAnimal,selectedFood);

    }

    private void requireActivity() {
        System.out.println("Please play " + selectedAnimal.getName());
        displayActivities();
        System.out.println("Select one of the activities");
        PlayTime selectedPlayTime = getSelectedActivityFromUser();
        System.out.println(selectedPlayTime.getName());
        player.playing(selectedAnimal, selectedPlayTime);


    }
}
