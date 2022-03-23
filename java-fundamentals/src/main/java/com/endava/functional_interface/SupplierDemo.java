package com.endava.functional_interface;



import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

// it can be use in all contexts where is no input but an output is expected.
public class SupplierDemo {
    public static void main(String[] args) {

        Supplier<String> supplier = () -> "Hello World!";
        System.out.println(supplier.get());

        List<String> list = Arrays.asList("Cristi", "David", "Jack");
        System.out.println(list.stream().findAny().orElseGet(supplier));



    }
}
