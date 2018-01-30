package com.company;

public class Main {

    public static void main(String[] args) {
//	    Player player = new Player();
//	    //Without encapsulation, we take control of the fields directly
//		//We may also forget to initialize all fields. Constructors take care of that
//	    player.name = "Tim";
//	    player.health = 20;
//	    player.weapon = "Sword";
//
//	    int damage = 10;
//	    player.loseHealth(damage);
//	    System.out.println("Remaining health = " + player.healthRemaining());
//
//	    damage = 11;
//	    player.health = 200; //Manipulation - Accessed in ways not intended
//		player.loseHealth(damage);
//		System.out.println("Remaining health = " + player.healthRemaining());

		EnhancedPlayer player = new EnhancedPlayer("Mike", 50, "sword");
		System.out.println("Initial health is " + player.getHealth()); //Only to see health now.
		}
    }

