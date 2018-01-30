package com.company;

public class Player {
//If we change a field or function here, we have to do this for all classes that access these fields
    public String name;
    public int health;
    public String weapon;

    public void loseHealth(int damage) {
        this.health = this.health - damage;
        if(this.health <= 0) {
            System.out.println("Player knocked out");
            //Reduce number of remaining lives for player
        }
    }

    public int healthRemaining() {
        return this.health;
    }
}
