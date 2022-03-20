package com.endava.part1.generics;

public class MyGenericComparator {

    public static <T extends Comparable> int compare(T first, T second) {
        return first.compareTo(second);
    }

}
