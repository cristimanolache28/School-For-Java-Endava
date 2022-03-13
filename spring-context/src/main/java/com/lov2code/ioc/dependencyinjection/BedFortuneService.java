package com.lov2code.ioc.dependencyinjection;

public class BedFortuneService implements FortuneService{
    @Override
    public String getFortune() {
        return "it was a bed day! It have been raining since 12'o clock.";
    }
}
