package com.example.bsmal.learnjava;

import java.util.Random;

public class VampireLord extends Vampire {

    public VampireLord(String name) {
        super(name);
        setHitPoints(140);
    }

    @Override
    public void takeDamage(int damage) {
        super.takeDamage(damage / 2);
    }

    public boolean runAway () {
//        if(getLives() < 2) {
//            return true;
//        } else {
//            return false;
//
//        } example of the long way to return value
        return (getLives() < 2); // will get the same result as above
    }

    public boolean dodges(){
        Random rand = new Random();
        int chance = rand.nextInt(6);
        if(chance> 3){
            System.out.println("Dracula dodges");
            return true;
        }
        return false;
    }
}
