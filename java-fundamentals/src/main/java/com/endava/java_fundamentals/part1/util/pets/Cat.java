package com.endava.java_fundamentals.part1.util.pets;

public class Cat implements Pet{
    private String name;

    public Cat(String name){
        this.name = name;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void feed(String food){
        System.out.println("Cat " + name + " is eating " + food);
    }
}
