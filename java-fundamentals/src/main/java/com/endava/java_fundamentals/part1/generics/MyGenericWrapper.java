package com.endava.java_fundamentals.part1.generics;

public class MyGenericWrapper<T> {
    private T value;

    public MyGenericWrapper(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }
}
