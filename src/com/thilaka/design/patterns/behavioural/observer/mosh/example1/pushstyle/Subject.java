package com.thilaka.design.patterns.behavioural.observer.mosh.example1.pushstyle;

import java.util.ArrayList;
import java.util.List;

//also called as Observable
public class Subject {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(int value){
        for(var observer: observers)
            observer.update(value);
    }
}
