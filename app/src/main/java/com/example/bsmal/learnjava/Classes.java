package com.example.bsmal.learnjava;

public class Classes {
    public static void main(String[] args) {

        int lives = 4;
        boolean isGameOver = (lives < 1); // boolean gives True or False statements

        if(isGameOver){
            System.out.println("Game Over! ");
        } else{
            System.out.println("You're still alive!");
        }
    }
}
