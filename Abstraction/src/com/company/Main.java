package com.company;

public class Main {
//Java allows abstract classes - define methods but do not provide an implementation of those methods
    //Implementation is left up to the classes that inherit from the abstract class
    public static void main(String[] args) {
        Dog dog = new Dog("Yorkie");
        dog.breathe();
        dog.eat();

//        Bird bird = new Bird("Parrot");
        //You can't directly instantiate an abstract class

        Parrot parrot = new Parrot("Australian Ringneck");
        parrot.breathe();
        parrot.eat();
        parrot.fly();

        Penguin penguin = new Penguin("Emperor");
        penguin.fly();
    }
}

//Is a... A dog is an animal so it inherits from an animal class
//Can fly interface would have been better than inheriting from bird class


//An abstract class can have member variables that are inherited
//Something that can't be done in an interface

//Interfaces can have variables but they're all public static final variables
//These are constant values that should never change with a static scope
//They have to be static because non-static variables require an instance and of course,
//You can't instantiate an interface.

//Interfaces cannot have constructors but abstract classes can

//All methods over an interface are automatically public
//Methods of an abstract class can have any visibility

//Abstract classes can have defined methods such as methods with implementation
//Methods in an interface are all abstract, no codes in abstract methods
//All the actual code has to be written in the class that implements the particular interface

//the animal class implements the getName() method and therefore does not have to be reproduced in other classes that inherit from this abstract class