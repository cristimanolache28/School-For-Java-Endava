package com.lov2code.ioc.xmlconfig;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class HelloSpringApp {
    public static void main(String[] args) {

        // load the spring configuration file
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext.xml");

        // retrieve bean from spring container
        Coach getBaseballBean = context.getBean("baseballCoachBean", Coach.class);
        Coach getTrackBean = context.getBean("trackCoachBean", Coach.class);

        // call methods on the bean
        System.out.println(getBaseballBean.getDailyWorkout());
        System.out.println(getTrackBean.getDailyWorkout());

        // close the context
        context.close();
    }
}
