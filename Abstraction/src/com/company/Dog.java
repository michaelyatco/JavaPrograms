package com.company;

public class Dog extends Animal {
    //In order to create a valid class we have to implement the methods


    public Dog(String name) {
        super(name); //Calls the constructor using the super keyword
    }

    @Override
    public void eat() {
        System.out.println(getName() + " is eating.");
    }

    @Override
    public void breathe() {
        System.out.println("Breathe in, breathe out, repeat");
    }
}
