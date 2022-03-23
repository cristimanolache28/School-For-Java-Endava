package com.endava.functional_interface;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

// accepts a single input argument and returns no result
public class ConsumerDemo {

    public static void main(String[] args) {
        System.out.println("Old way");
        Consumer<Integer> consumer =
                (t) -> System.out.println("Print consumer: " + t);

        consumer.accept(10);
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
        list.stream()
                .forEach(consumer);

        System.out.println("\nNew way");
        List<Integer> list2 = Arrays.asList(1, 2 ,3, 4, 5, 6, 7, 8, 9, 10);
        list.stream()
                .forEach(l -> System.out.println("LIST2: Number " + l));
    }
}
