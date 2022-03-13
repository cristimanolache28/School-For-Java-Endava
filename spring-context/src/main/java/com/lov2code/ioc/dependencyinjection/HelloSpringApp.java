package com.lov2code.ioc.dependencyinjection;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class  HelloSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContextDI.xml");

        // retrieve bean from spring container
        Coach getBaseballBean = context.getBean("myBaseballCoachBean", Coach.class);
        Coach getTrackBean = context.getBean("myTrackCoachBean", Coach.class);
        CricketCoach theCoach = context.getBean("myCricketCoachBean", CricketCoach.class);

        // call methods on the bean
        System.out.println(getBaseballBean.getDailyWorkout());
        System.out.println(getTrackBean.getDailyWorkout());
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // let's call our new method for fortunes
        System.out.println(getBaseballBean.getDailyFortune());
        System.out.println(getTrackBean.getDailyFortune());

        // close the context
        context.close();
    }
}
