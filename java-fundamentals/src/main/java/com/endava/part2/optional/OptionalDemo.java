package com.endava.part2.optional;

import net.minidev.json.JSONUtil;

import javax.swing.text.html.Option;
import java.util.Arrays;
import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {

        Customer customer = new Customer(101, "John", null, Arrays.asList("321412", "43242"));

        // empty


        Optional<Object> emptyOptional = Optional.empty();
//        System.out.println(emptyOptional);

        // of
//        Optional<String> emailOptional = Optional.of(customer.getEmail());
//        System.out.println(emailOptional);

        //ofNullable
        Optional<String> emailOptional2 = Optional.ofNullable(customer.getEmail());
//        if (emailOptional2.isPresent()) {
//            System.out.println(emailOptional2.get());
//        }
//          System.out.println(emailOptional2.orElse("dafault@gamil.com"));
        System.out.println(emailOptional2.orElseThrow(() -> new IllegalArgumentException("email not present")));
    }
}
