package com.example.test;

public class Main {//Math is final class cannot be extended as subclass

    public static void main(String[] args) {
    SomeClass one = new SomeClass("one");
    SomeClass two = new SomeClass("two");
    SomeClass three = new SomeClass("three");

    System.out.println(one.getInstanceNumber());
    System.out.println(two.getInstanceNumber());
    System.out.println(three.getInstanceNumber());

    // one.instanceNumber = 4; //will not work because final declared for instanceNumber
    System.out.println(Math.PI); //PI is public static final double
    //Math m = new Math(); //constructor marked private
        //Final methods cannot be overridden

        int pw = 674312;
        Password password = new Password(pw);
        password.storePassword();

        password.letMeIn(1);
        password.letMeIn(523266);
        password.letMeIn(9773);
        password.letMeIn(0);
        password.letMeIn(-1);
        password.letMeIn(674312);
    }
}
