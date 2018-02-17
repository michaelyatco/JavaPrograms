package com.example.test;

public class StaticTest { //static and fields belong to the class; not the instances. Can be called by referencing the class instead of the class instance
    private static int numInstances = 0; //static field / class variable / associated with the class
    private String name;

    public StaticTest(String name) {
        this.name = name;
        numInstances++;
    }

    public static int getNumInstances() {
        return numInstances;
    }

    public String getName() {
        return name;
    }
}
