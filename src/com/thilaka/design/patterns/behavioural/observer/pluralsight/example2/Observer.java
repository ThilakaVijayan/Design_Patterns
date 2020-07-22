package com.thilaka.design.patterns.behavioural.observer.pluralsight.example2;

public abstract class Observer {
    protected Subject subject;
    abstract void update();
}
