package com.endava.part2;

import com.endava.part2.datasource.UserDataSource;
import com.endava.part2.exception.UserNotFoundException;
import com.endava.part2.model.User;

public class App {
    public static void main(String[] args) {
        UserDataSource userDataSource = new UserDataSource();

//        System.out.println(userDataSource.getUserWithHighestAge());
//        System.out.println(userDataSource.getJobOfTheOldestUser());
//        System.out.println(userDataSource.getAllUsersAndChangeTheJobForYoungerOnes());
//        System.out.println(userDataSource.findByFirstName("Jack"));
//        System.out.println(userDataSource.getAllUserJobsSorted());
//        System.out.println(userDataSource.getJobOfTheOldestUser());
//        System.out.println(userDataSource.areAllUsersOlderThan(10));

//        userDataSource.changeAllStudentsJobsAndAges();
//        System.out.println(userDataSource.countUsersHavingTheSpecifiedJob("student"));
//        userDataSource.addUser(new User(10, "Cristi", "Mano", 43, "x"));
//        System.out.println(userDataSource.getAll());
//        System.out.println(userDataSource.getAll());
//        System.out.println(userDataSource.getMapOfUsers());
        System.out.println(userDataSource.getMapOfUsers());

    }
}
