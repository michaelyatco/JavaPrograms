package com.company;

public class Main {

    public static void main(String[] args) {
        int myMinValue = -2_147_483_648;
        int myMaxValue = 2147483647;

        //Int - Best data type to use generally

        byte myMinByteValue = -128;
        byte myMaxByteValue = 127;
        /*1/4 space of an integer*/

        byte myNewValue = (byte) (myMinByteValue/2);
        // Example of casting

        short myMinShortValue = -32768;
        short myMaxShortValue = 32767;
        // 1/2 space of integer //

        short myNewShortValue = (short) (myMinShortValue/2);
        // Example of casting

        long myMinLongValue = -9223372036854775808L;
        long myMaxLongValue = 9223372036854775807L;
        // 2x space of integer

        //THE FOUR DATA TYPES THAT DEAL WITH WHOLE NUMBERS

        byte myByte = 10;
        short myShort = 20;
        int myInt = 50;
        long myLong = 50000L + 10L * (myByte + myShort + myInt);
        //No need to cast because a long data type will accept this value

        short myShortTotal = (short) (1000 + 10 * (myByte + myShort + myInt));
        //Casting necessary

        System.out.println("Long Total = " + myLong);
        System.out.println("Short Total = " + myShortTotal);
    }
}
