package com.company;

public class Parrot extends Bird {

    public Parrot(String name) {
        super(name);
    }

//    @Override
//    public void fly() {
//        System.out.println("Flitting from branch to branch.");
//    }
    //No need because Parrot inherits from Bird which is implementing CanFly Interface
}