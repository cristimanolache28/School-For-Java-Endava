package com.endava.java_fundamentals.part1.generics;

import com.endava.java_fundamentals.part1.util.pets.Pet;

import java.util.List;

public class AwesomePetFeeder {
    public static void feedPets(List<? extends Pet> pets) {
        pets.forEach(p -> p.feed("awesome food"));
    }
}
