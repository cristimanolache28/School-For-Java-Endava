package com.endava.java_fundamentals.part1.util.vehicles;

public interface Vehicle {
    // Please don't chage this
    default int getTires() {
        return 0;
    }
}
