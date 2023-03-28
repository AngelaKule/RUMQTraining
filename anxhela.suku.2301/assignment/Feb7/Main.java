package assignment.Feb7;

import java.util.HashMap;


public class Main {
    public static void main(String[] args) {
       // 1. Write a program to create a Map of country names and their capital cities and display the elements using an Iterator.
       // 2. Write a program to demonstrate the use of the put() method to add elements to a Map.

       // declare a Map
       var cities = new HashMap<Country, String>();

       // put() function to add key and values
       cities.put(new Country("Albania"), "Tirana");
       cities.put(new Country("Canada"), "Ottawa");
       cities.put(new Country("Italy"), "Rome");
       cities.put(new Country("Kosovo"), "Prishtine");
       cities.put(new Country("Greece"), "Athina");

       // iteration 
       cities.forEach((key, value) -> System.out.println("The capital of " + key + " is " + value + "."));
    }

}

