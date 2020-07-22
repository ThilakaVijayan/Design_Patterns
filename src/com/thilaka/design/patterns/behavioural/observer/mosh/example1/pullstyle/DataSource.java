package com.thilaka.design.patterns.behavioural.observer.mosh.example1.pullstyle;

public class DataSource extends Subject {
    private int value;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        notifyObservers();
    }
}
