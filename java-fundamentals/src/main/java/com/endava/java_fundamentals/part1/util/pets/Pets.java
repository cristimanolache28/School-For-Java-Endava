package com.endava.java_fundamentals.part1.util.pets;

import java.util.List;

public class Pets {

    // TO DO set generic type to list param
    public static void addPet(List list, Pet pet) {
        list.add(pet);
    }

    // TO DO set generic type to list param
    public static void addCat(List list, Cat cat) {
        list.add(cat);
    }

    // TO DO set generic type to list param
    public static void addDog(List list, Dog dog){
        list.add(dog);
    }

    // Return a list that contains all the pat names
    // TO DO set generic type to list param & uncomment the loop from below
    public static String getPetNames(List list) {
        StringBuilder text = new StringBuilder();
        return text.toString();
    }
}
