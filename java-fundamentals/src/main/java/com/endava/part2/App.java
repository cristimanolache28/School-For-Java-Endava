package com.endava.part2;

import com.endava.part2.datasource.UserDataSource;

public class App {
    public static void main(String[] args) {
        UserDataSource userDataSource = new UserDataSource();

        System.out.println(userDataSource.getUserWithHighestAge());
    }
}
