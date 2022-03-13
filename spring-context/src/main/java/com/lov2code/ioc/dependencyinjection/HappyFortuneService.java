package com.lov2code.ioc.dependencyinjection;

public class HappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today is your lucky day!";
    }
}
