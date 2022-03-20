package com.endava.part1.generics;

import com.endava.part1.util.pets.Cat;
import com.endava.part1.util.pets.Dog;
import com.endava.part1.util.pets.Pet;

import java.util.ArrayList;
import java.util.List;

public class GenericsMain {
    public static void main(String[] args) {

        // Comparator
        Integer first = 10;
        Integer second = 20;
        String firstString = "abc";
        String secondString = "cba";

        MyComparator myComparator = new MyComparator();
        System.out.println(myComparator.compare(first, second));
        System.out.println(myComparator.compare(firstString, secondString));

        System.out.println(MyGenericComparator.compare(first, second));
        System.out.println(MyGenericComparator.compare(firstString, secondString));

        // Wrapper class
        String value = "test";
        MyWrapper wrapper = new MyWrapper(value);
        String wrappedValue = (String) wrapper.getValue();

        MyGenericWrapper<String> myGenericComparator = new MyGenericWrapper<>(value);
        String wrappedGenericValue = myGenericComparator.getValue();

        // List of numbers
        List<? super Number> myList = new ArrayList<>();
        Integer myInt = 10;
        Float myFloat = 30.5F;
        Double myDouble = 20.5;

        myList.add(myInt);
        myList.add(myFloat);
        myList.add(myDouble);

        for (int i = 0; i < myList.size(); i++) {
            System.out.println(myList.get(i));
        }

        // Pet feeder
        List<Pet> pets = new ArrayList<>();
        Cat cat = new Cat("Missy");
        Dog dog = new Dog("Jack");
        pets.add(cat);
        pets.add(dog);
        AwesomePetFeeder.feedPets(pets);
    }
}
