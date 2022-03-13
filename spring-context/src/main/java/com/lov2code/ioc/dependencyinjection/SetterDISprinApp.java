package com.lov2code.ioc.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SetterDISprinApp {

    public static void main(String[] args) {
        //reate context
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextDI.xml");

        // add bean in context
        CricketCoach theCricketCoach = context.getBean("myCricketCoachBean", CricketCoach.class);

        // call bean from context
        System.out.println(theCricketCoach.getDailyWorkout());
        System.out.println(theCricketCoach.getDailyFortune());

        // call ore new methods to get the literal values
        System.out.println(theCricketCoach.getEmailAddress());
        System.out.println(theCricketCoach.getTeam());

        context.close();
    }
}
