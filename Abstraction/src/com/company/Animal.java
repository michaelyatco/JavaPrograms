package com.company;

public abstract class Animal {
    private String name;

    public Animal(String name) { //Constructors
        this.name = name;
    }

    public abstract void eat(); //Fields
    public abstract void breathe();

    public String getName() { //Methods
        return name;
    }
}


//Interface - no opportunity to enter any fields
//Interface - Entirely abstract - no implementation whatsoever