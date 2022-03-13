package com.lov2code.ioc.dependencyinjection;

public class UnhappyFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "Today isn't a good day for walking.";
    }
}
