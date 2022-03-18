package com.endava.java_fundamentals.part1.util.pets;

public class Dog implements Pet{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

}
