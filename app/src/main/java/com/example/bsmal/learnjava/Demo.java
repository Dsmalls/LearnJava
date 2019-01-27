package com.example.bsmal.learnjava;

import java.util.ArrayList;

public class Demo {

    public static void main(String[] args) {
//        Player des = new Player("Juba`", 8);
//        System.out.println(des.getHandleName());
//        System.out.println("Levels: " + des.getLevels());
//        System.out.println("Lives: " + des.getLives());
//        System.out.println(des.getWeapon().getName().toUpperCase());
//        Weapon desWeapon = des.getWeapon();
//        System.out.println(desWeapon.getName());
//        System.out.println(des.getWeapon().getName());
//        Weapon myGun = new Weapon("Omega Shotgun", 15, 50);
//        des.setWeapon(myGun);
//        System.out.println(des.getWeapon().getName());
//        Loot purplePotion = new Loot("Purple Potion", LootType.POTION, 8);
//        des.pickUpLoot(purplePotion);
//        des.pickUpLoot(new Loot("+5 Chest Armour", LootType.ARMOUR, 85));
//        des.pickUpLoot(new Loot("Ring of protection + 4", LootType.RING, 45));
//        des.pickUpLoot(new Loot("Invisibility Potion", LootType.POTION, 55));
//        des.showInventory();
//        Loot goldPotion = new Loot("Gold Potion", LootType.POTION, 10);
//        boolean wasDeleted = des.dropLoot(goldPotion);
//        System.out.println(wasDeleted);
//        des.showInventory();

//        Enemy enemy = new Enemy(" Test enemy", 10, 3);
//        enemy.showInfo();
//        enemy.takeDamage(3);
//        enemy.showInfo();
//        enemy.takeDamage(11);
//        enemy.showInfo();

//        DemonDogs deadlyDemonDogs = new DemonDogs("Deadly Demon Dog");
//        deadlyDemonDogs.showInfo();
//        deadlyDemonDogs.takeDamage(30);
//
//        Vampire sinister = new Vampire("Sinister");
//        sinister.showInfo();
//        sinister.takeDamage(8);
//        sinister.showInfo();
//        System.out.println("====================================================");
//
//        VampireLord dracula = new VampireLord("Dracula");
//        dracula.showInfo();

        // example of a While Loop
        // while loop: A while loop is a control flow statement that allows code to be executed repeatedly based on a given Boolean condition.
        // The while loop can be thought of as a repeating if statement
        // while (boolean condition)
        //{
        //   loop statements...
        //}

//        while (dracula.getLives() > 0) { // this is the condition for the while loop
//            if(dracula.dodges()){
//                continue; // causes the loop block to be skipped
//            }
//            if (dracula.runAway()) {
//                System.out.println("Dracula ran away");
//                break; // this will stop the result of the infinite loop
//            } else {
//                dracula.takeDamage(12); // the code inside the {} is a Block of code, also refer to as Block
//                dracula.showInfo(); // this block will result into an infinite loop without the break statement
//            }
//
//        }

        Player conan = new Player("Conan");
        conan.pickUpLoot(new Loot("Invisibility", LootType.POTION, 4));
        conan.pickUpLoot(new Loot("Mithril", LootType.ARMOUR, 183));
        conan.pickUpLoot(new Loot("Ring of speed", LootType.RING, 25));
        conan.pickUpLoot(new Loot("Red Potion", LootType.POTION, 2));
        conan.pickUpLoot(new Loot("Cursed Shield", LootType.ARMOUR, -8));
        conan.pickUpLoot(new Loot("Brass Ring", LootType.RING, 1));
        conan.pickUpLoot(new Loot("Chain Mail", LootType.ARMOUR, 4));
        conan.pickUpLoot(new Loot("Gold Ring", LootType.RING, 12));
        conan.pickUpLoot(new Loot("Health Potion", LootType.POTION, 3));
        conan.pickUpLoot(new Loot("Silver Ring", LootType.RING, 6));
        conan.showInventory();

        System.out.println(conan.score());
        conan.dropLoot("Cursed Shield");
        System.out.println(conan.score());

        //Example of do while loop
        // do while: do while loop is similar to while loop with only difference that it
        // checks for condition after executing the statements, and therefore is an example of Exit Control Loop.
        // do
        //{
        //    statements..
        //}
        //while (condition);

//        VampireLord dracula = new VampireLord("Dracula");
//        dracula.showInfo();
//
//        dracula.setLives(0);
//
//        do {
//            if (dracula.dodges()) {
//                dracula.setLives(dracula.getLives() + 1);
//                continue;
//            }
//
//            if (dracula.runAway()) {
//                System.out.println("Dracula ran away");
//                break;
//            } else {
//                dracula.takeDamage(80);
//                dracula.showInfo();
//            }
//        } while (dracula.getLives() > 0);
//        System.out.println("====================================");

    }
}
