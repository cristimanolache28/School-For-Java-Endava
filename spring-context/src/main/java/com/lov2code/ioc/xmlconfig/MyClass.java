package com.lov2code.ioc.xmlconfig;

public class MyClass {
    public static void main(String[] args) {

        // create object
        Coach  baseballCoach = new BaseballCoach();
        Coach  trackCoach = new TrackCoach();

        // use the object
        System.out.println(baseballCoach.getDailyWorkout());
        System.out.println(trackCoach.getDailyWorkout());
    }
}
