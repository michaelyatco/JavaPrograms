package com.company;

public class Main {

    public static void main(String[] args) {
	    int myIntValue = 5 / 3;
	    //width of int = 32 (4 bytes)
	    float myFloatValue = 5f / 3f;
        //width of float = 32 (4 bytes)
	    double myDoubleValue = 5d / 3d;
        //width of double = 64 (8 bytes)
	    System.out.println("myIntValue = " + myIntValue);
        System.out.println("myFloatValue = " + myFloatValue);
        // 7 digits of precision after decimal
        System.out.println("myDoubleValue = " + myDoubleValue);
        // 16 digits of precision after decimal
        // Double precision is faster on modern computers
        // Input functions in Java are used with doubles
        // Sin and Cos and other mathematical operations are used with doubles

        double numPounds = 200d;
        double convertedKilograms = numPounds * 0.45359237d;
        System.out.println("Kilograms = " + convertedKilograms);
    }
}
