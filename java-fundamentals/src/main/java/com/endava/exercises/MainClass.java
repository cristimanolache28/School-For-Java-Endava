package com.endava.exercises;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class MainClass {
    public static void main(String[] args) {
        List<String> numbers = Arrays.asList("1", "2", "3", "4", "5", "6");

        System.out.println(getEvenNumbers((numbers)));

    }

    // Get the even number from the list of string number
    public static List<Integer> getEvenNumbers(List<String> list) {
         return list.stream()
                .map(Integer::valueOf)
                .filter(u -> u % 2 == 2)
                .collect(Collectors.toList());
    }
}
