package com.endava.part1.util.pets;

public interface Pet {
    String getName();

    static void play(){
        System.out.println("Pet is playing");
    }

    default void feed(String food) {
        System.out.println(getName() + " is eating " + food);
    }
}
