package com.endava.java_fundamentals.part1.generics;

public class MyWrapper {
    private Object value;

    public MyWrapper(Object value) {
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }
}
