package com.example.bsmal.learnjava;

import java.util.ArrayList;

public class Player {
    private String handleName;
    private int lives;
    private int levels;
    private int score;
    private Weapon weapon;
    private ArrayList<Loot> inventory;
    // The ArrayList class extends AbstractList and implements the List interface. ArrayList supports dynamic arrays that can grow as needed.
    // a constructor is a method that's called when you create a new instance
    // a getter now Getter is a method that's used to get the value of a field

    public Player() { // constructors
        this("Unknown Player");

    }

    public Player(String handle){ //constructor
        this(handle, 1);
        //handleName = handle;
        //lives = 3;
        //levels = 1;
        //score = 0;
    }

    public Player(String handle, int startingLevel) { //constructor
//        this.handleName = handle;
//        this.lives = 3;
//        this.levels = startingLevel;
//        this.score = 0;
        setHandleName(handle);
        setLives(3);
        setLevels(startingLevel);
        setScore(0);
        setDefaultWeapon();
        inventory =  new ArrayList<>();
    }

    public String getHandleName(){
        return handleName;
    }

    public void setHandleName(String handle) {
        if(handle.length() < 3) {
            System.out.println("The name " + handle + " is too short, must be three characters or more.");
            return;
        }
        this.handleName = handle;

    }

    private void setDefaultWeapon(){
        this.weapon = new Weapon("Katana", 10, 20);
    }

    public void setNameAndLevels(String name, int levels){
//        this.handleName = name;
//        this.levels = levels;
        setHandleName(name);
        setLevels(levels);
    }

    public int getLives() {
        return lives;
    }

    public void setLives(int lives) {
        this.lives = lives;
    }

    public int getLevels() {
        return levels;
    }

    public void setLevels(int levels) {
        this.levels = levels;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Weapon getWeapon() { // player object
        return weapon;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }

    public ArrayList<Loot> getInventory() {
        return inventory;
    }

//    public void setInventory(ArrayList<Loot> inventory) {
//        this.inventory = inventory;
//    }
    public void pickUpLoot(Loot newLoot){
        inventory.add(newLoot);
    }

    public boolean dropLoot(Loot loot){
        if(this.inventory.contains(loot)) {
            inventory.remove(loot);
            return true;
        }
        return false;
    }

    public boolean dropLoot(String lootName){
        for(Loot currentLoot : inventory){
            if(currentLoot.getName().equals(lootName)){
                inventory.remove(currentLoot);
                return true;
            }
        }
        return false;
    }

    public void showInventory(){
        for(Loot item : inventory){
            System.out.println(item.getName());
        }

        System.out.println("========================================================================");
    }

    // Example of For Loop
    // for loop: for loop provides a concise way of writing the loop structure.
    // Unlike a while loop, a for statement consumes the initialization, condition and increment/decrement in one line thereby providing a shorter,
    // easy to debug structure of looping.
    // for (initialization condition; testing condition;
    //                              increment/decrement)
    //{
    //    statement(s)
    //}

    public int score() {
        int total = 0;
        for(int i=0; i<inventory.size(); i++){ // example of for loop
            Loot currentLoot = inventory.get(i);
            System.out.println(currentLoot.getName() + " is worth " + currentLoot.getValue());
            total = total + currentLoot.getValue();
        }
        return total;
    }
}
