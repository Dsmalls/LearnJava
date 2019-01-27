package com.example.bsmal.learnjava;
// public tells Java that this should be available to all other classes
// classes are blue prints used to design objects that contain attributes (variables) and methods (functions)
/* public allows other classes to use this function
   static means that only a class can call for this function to execute
   void states that this function doesn't return any values after it is done executing
   main is required in every Java program. This function is always executed first
   System.out is an object that outputs information
   println is a function that prints to the screen what ever you provide between the braces
   "Hello World" is a string of characters. Strings must be surrounded with quotes
   Every statement ends with a semicolon ;
 */

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("My First Java Program! ");

        /*
        Variable names are case sensitive. Age is not the same as age.
        Variables must begin with a letter and contain numbers, _, or $
        You must declare all variables before you can use them with a data type
        variables or fields now you'll see both terms used and they are pretty much the same thing the
        differences is in where they're defined now variables exist inside a method only and
        can't be accessed from code outside the method whereas fields are just variables that
        can be used from anywhere
         */

        String des; // the variable des is defined
        des = "Desmond Smalls"; // the variable is assigned
        System.out.println(des);

        int desWeeklySalary = 50;
        int desMonthlySalary = desWeeklySalary * 4;
        System.out.println("Weekly Salary: " + desWeeklySalary);
        System.out.println("Monthly Salary: " + desMonthlySalary);

        int apples = 6; // in can only store whole numbers or integers
        int oranges = 5;
        int fruit = apples + oranges;
        System.out.println("I have " + fruit + " fruit");

        int weeks = 130;
        double  years = weeks / 52.0;
        System.out.println(weeks + " weeks is " + years + " years");

        System.out.println("Hello, " + des + " here") ; // example of concatenating or joining strings
    }
}
