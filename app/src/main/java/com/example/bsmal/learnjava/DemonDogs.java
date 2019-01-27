package com.example.bsmal.learnjava;

public class DemonDogs extends Enemy {  // if I want to extend the class will need to provide an constructor...hence an error will occur

    public DemonDogs(String name) { // this is calling the enemy class constructor
        super(name, 27, 2);
    }
}
