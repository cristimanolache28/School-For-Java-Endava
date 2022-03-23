package com.endava.functional_interface;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

// for condition check
public class PredicateDemo {

    public static void main(String[] args) {

        List<String> list = Arrays.asList("Oliver", "Leo", "Oscar", "Jack", "George");

        System.out.println("Old approach");
        Predicate<String> predicate = p -> p.toLowerCase().startsWith("o");
        List<String> newList1 = list.stream()
                .filter(predicate)
                .collect(Collectors.toList());
        System.out.println(newList1);


        System.out.println("\nModern approach");
        List<String> newList2 = list.stream()
                .filter(user -> user.toLowerCase().startsWith("j"))
                .collect(Collectors.toList());
        System.out.println(newList2);

        System.out.println("\nAnother Modern approach");
        List<Integer> listOfNumbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        List<Integer> newList = listOfNumbers.stream()
                .filter(number -> number % 2 == 0)
                .collect(Collectors.toList());
        System.out.println(newList);


    }
}
