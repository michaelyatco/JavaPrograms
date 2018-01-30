package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

class IntClass {
    private int myValue;

    public IntClass(int myValue) {
        this.myValue = myValue;
    }

    public int getMyValue() {
        return myValue;
    }

    public void setMyValue(int myValue) {
        this.myValue = myValue;
    }
}
public class Main {

    public static void main(String[] args) {
        //Different ways of creating arrays
	    String[] strArray = new String[10];
	    int[] intArray = new int[10];

        ArrayList<String> strArrayList = new ArrayList<String>();
        strArrayList.add("Tim");

        //ArrayList<int> intArrayList = new ArrayList<int>();
        //Type argument cannot be of primitive type - We need a class

        ArrayList<IntClass> intClassArrayList = new ArrayList<IntClass>();
        intClassArrayList.add(new IntClass(54));

        //Autoboxing - An object wrapper for the class like above
        //Wrapped the functionality

        Integer integer = new Integer(54);
        //Integer is actually a class / 'int' is just a primitive data type
        Double doubleValue = new Double(12.25);

        ArrayList<Integer> intArrayList = new ArrayList<Integer>();
        for(int i=0; i<10; i++) {
            intArrayList.add(Integer.valueOf(i));
            //Taking the value of i as a primitive type and converting it into the Integer class

        }

        for(int i=0; i<10; i++) {
            System.out.println(i + " --> " + intArrayList.get(i).intValue());

        }

        //Unboxing - converting from the object wrapper or Class back into the primitive data type

        Integer myIntValue = 56; //Integer.valueOf(56) <-- same thing when code is compiled
        //Where is the 'new' keyword?
        //Java is helping you here with this shortcut

        int myInt = myIntValue; //myIntValue.intValue()
        //primitive ... object //

        ArrayList<Double> myDoubleValues = new ArrayList<Double>();
        for(double dbl=0.0; dbl<=10.0; dbl += 0.5) {
            myDoubleValues.add(dbl); //shortcut
            // myDoubleValues.add(Double.valueOf(dbl)); longer way
            //Autoboxing - converting primitive type double to object wrapper
        }

        for(int i = 0; i<myDoubleValues.size(); i++) {
            double value = myDoubleValues.get(i); //.doubleValue(); we don't need this actually added
                System.out.println(i + " --> " + value);
                //Unboxing - converting from opbject wrapper back to primitive type
            }
        }
    }
