package com.endava.part2.optional;

import com.endava.part2.datasource.UserDataSource;
import com.endava.part2.model.User;

public class OptionalMain {

    public static void main( String[] args )
    {
        UserDataSource dataSource = new UserDataSource();

        // vars
        User foundUser;
        int id = 3;

        // w/o method reference
        // orElseThrow
        foundUser = dataSource.findById(id).orElseThrow(() -> new RuntimeException("User with id " + id + " not found."));

        // orElseGet
        foundUser = dataSource.findById(id).orElseGet(() -> new User());

        // map orElse
        int foundUserAge = dataSource.findById(id).map(u -> u.getAge()).orElse(0);

        // ifPresent
        dataSource.findById(id).ifPresent(u -> System.out.println(u.toString()));


        // w/ method reference
        // orElseThrow
        foundUser = dataSource.findById(id).orElseThrow(RuntimeException::new);

        // orElseGet
        foundUser = dataSource.findById(id).orElseGet(User::new);

        // map orElse
        foundUserAge = dataSource.findById(id).map(User::getAge).orElse(0);

        // ifPresent
        dataSource.findById(id).ifPresent(System.out::println);
    }
}
