package com.example.test;

public class Main {

    public static int multiplier = 7;

    public static void main(String[] args) {
//        StaticTest firstInstance = new StaticTest("1st Instance");
//        System.out.println(firstInstance.getName() + " is instance number " +StaticTest.getNumInstances()); //use class name instead of instance name firstInstance.getNumInstances()
//
//        StaticTest secondInstance = new StaticTest("2nd Instance");
//        System.out.println(secondInstance.getName() + " is instance number " + StaticTest.getNumInstances());
//
//        StaticTest thirdInstance = new StaticTest("3rd Instance");
//        System.out.println(thirdInstance.getName() + " is instance number " + StaticTest.getNumInstances());

        // java com.company._static.Main
        int answer = multiply(6);
        System.out.println("The answer is " + answer); //non static method w/o
        System.out.println("Multiplier is " + multiplier);
        }

    public static int multiply(int number) {
        return number * multiplier;
    }
    //Static methods can access non-static fields
}
