package com.workintech.model;

public class Player {

    private String name;
    private int healthPercentage;
    private Weapon weapon;

    private void checkHealth(int healthPercentage){
        if(healthPercentage > 100) {
            this.healthPercentage = 100;
        } else {
            this.healthPercentage = healthPercentage;
        }
        if(healthPercentage < 0) {
            this.healthPercentage = 0;
        } else {
            this.healthPercentage = healthPercentage;
        }

    }

    public Player(String name, int healthPercentage, Weapon weapon) {
        this.name = name;
       //TODO check
        checkHealth(healthPercentage);
        this.weapon = weapon;
    }

    public int healthRemaining(){
        return healthPercentage;
    }

    public void loseHealth(int damage) {
        int healthRemain = healthPercentage - damage;
        if(healthRemain <= 0 ) {
          System.out.println(name + " player has been knocked out of game" );
        }
    }
}
