package com.example.mypackage;

import com.example.game.ISaveable;
import com.example.game.Monster;
import com.example.game.Player;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Player tim = new Player("Tim", 10, 15);
        System.out.println(tim.toString());
        saveObject(tim);

        tim.setHitPoints(8);
        System.out.println(tim);
        tim.setWeapon("Stormbringer");
        saveObject(tim);
//        loadObject(tim); Will not save werewolf if active
        System.out.println(tim);

        ISaveable werewolf = new Monster("Wolf", 20, 40);
        //werewolf.getStregnth(); will not work
        System.out.println("Strength = " + ((Monster) werewolf).getStrength());//Casting is necessary
        //Says we know this base class will use ISaveable interface
        //But now this is the monster class
        //Declaration is key / When to declare the instance or interface
        //If you want to declare a varaible that can hold objects of different types = common interface
        //If you want to access the methods within a class that are not part of an interface = class
        //No real reason to declare Monster because the interface methods are pretty generic
        System.out.println(werewolf);
        saveObject(werewolf);
    }

    public static ArrayList<String> readValues() {
        ArrayList<String> values = new ArrayList<String>();

        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        int index = 0;
        System.out.println("Choose\n" +
        "1 to enter a string\n" +
        "0 to quit");

        while(!quit) {
            System.out.println("Choose an option: ");
            int choice = scanner.nextInt();
            scanner.nextLine();
            switch (choice) {
                case 0:
                    quit = true;
                    break;
                case 1:
                    System.out.print("Enter a string: ");
                    String stringInput = scanner.nextLine();
                    values.add(index, stringInput);
                    index++;
                    break;
            }
        }

        return values;
    }

    public static void saveObject(ISaveable objectToSave) { //Use any object that is using this interface //multiple classes
        for(int i = 0; i<objectToSave.write().size(); i++) { //.write() returns a list
            System.out.println("Saving " + objectToSave.write().get(i) + " to storage device.");
        }
    }

    public static void loadObject(ISaveable objectToLoad) {
        ArrayList<String> values = readValues();
        objectToLoad.read(values);
    }
}
