package com.lov2code.ioc.randomFortuneChallenger;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class PracticeBeanScopeDemo {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("appContextChallenger.xml");

        // retrieve bean from spring container
        Coach theCoach = context.getBean("myGolfCoach", Coach.class);

        // call methods on the bean
        System.out.println(theCoach.getDailyWorkout());
        System.out.println(theCoach.getDailyFortune());

        // close the context
        context.close();
    }
}
