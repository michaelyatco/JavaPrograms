package com.company;

public class Main {

    //software object stores its state in fields/variables
    //Expose their behavior with methods
    //Class as a template for creating objects
    //Think of it as a User-defined data type

    public static void main(String[] args) {
        Car porsche = new Car(); //If you define but don't initialize the object you will get a NullPointerException
        Car holden = new Car();
        System.out.println("Model is " + porsche.getModel()); //null
        porsche.setModel("Carrera");
        System.out.println("Model is " + porsche.getModel());
    }
}
