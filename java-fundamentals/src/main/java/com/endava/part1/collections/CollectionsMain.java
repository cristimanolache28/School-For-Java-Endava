package com.endava.part1.collections;

import java.util.*;

public class CollectionsMain {
    public static void main(String[] args) {

        // Set
        Set<Integer> mySet = new HashSet<>();
        mySet.add(10);
        mySet.add(20);
        mySet.add(30);

        System.out.println("Set values");
        for (Integer val : mySet) {
            System.out.println(val);
        }

        // Queue
        Queue<String> myQueue = new PriorityQueue<>();
        myQueue.add("text");
        myQueue.add("aaa");

        System.out.println("\nQueue values");
        for (String val : myQueue) {
            System.out.println(val);
        }

        // Map
        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("ten", 10);
        myMap.put("twenty", 20);
        myMap.put("six", 6);
        myMap.put("six", 8);

        System.out.println("\nMap values");
        for (String val : myQueue) {
            System.out.println(val);
        }

    }
}
