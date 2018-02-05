package com.company;

public class Penguin extends Bird {

    public Penguin(String name) {
        super(name);
    }

    @Override
    public void fly() {
        super.fly(); //Penguin can flap but doesn't mean it could fly well.
        System.out.println("I'm not very good at that, can I go for a swim instead?");
    }
}
