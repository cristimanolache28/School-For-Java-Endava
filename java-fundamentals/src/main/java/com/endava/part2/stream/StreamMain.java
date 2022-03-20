package com.endava.part2.stream;

import com.endava.part2.datasource.UserDataSource;

public class StreamMain {

    public static void main( String[] args )
    {
        UserDataSource dataSource = new UserDataSource();

        System.out.println(dataSource.getUsersNamesWithAgeGreaterThanThirty());
        System.out.println("Sum of ages of users with first names starting with letter J are " + dataSource.sumUpUserAgesWhereFirstNameStartsWithJ());
        System.out.println("Oldest user is " + dataSource.getUserWithHighestAge());
        System.out.println("Oldest user is " + dataSource.getUserWithHighestAge_V2());
    }
}
