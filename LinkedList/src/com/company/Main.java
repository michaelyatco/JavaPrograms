package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	    Customer customer = new Customer("Tim", 54.96);
	    Customer anotherCustomer;
	    anotherCustomer = customer; //assigning the second customer to point to the first class. Did not create a second class.
	    anotherCustomer.setBalance(12.18);
	    System.out.println("Balance for customer " + customer.getName() + " is " + customer.getBalance());
		//We can't use pointers in Java

		ArrayList<Integer> intList = new ArrayList<Integer>();

		intList.add(1);
		intList.add(3);
		intList.add(4);

		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}

		intList.add(1, 2);
		for(int i=0; i<intList.size(); i++) {
			System.out.println(i + ": " + intList.get(i));
		}
    }
}
