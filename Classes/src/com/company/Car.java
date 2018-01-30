package com.company;

//public - access modifier
//State of the car = fields/variables (5)
//private - encapsulation(The internal workings are only allowed to be access by this class)
//protected
//encapsulation - allows data within our objects to be validated and correct

public class Car {
    //field(f)
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    private String color;

    //method(m)            //parameter(p)
    //Update the field with a parameter
    //setter method
    public void setModel(String model) {
        String validModel = model.toLowerCase(); //Validation
        if(validModel.equals("carrera") || validModel.equals("commodore")) {
            this.model = model;
        } else {
            this.model = "Unknown";
        }
    }

    //getter method
    public String getModel() {
        return this.model;
    }
}
