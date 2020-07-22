package com.thilaka.design.patterns.behavioural.observer.mosh.example2.attempt.framework;


import java.util.ArrayList;
import java.util.List;

public abstract class Observable {
    private List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer observer){
        observers.add(observer);
    }
    public void removeObserver(Observer observer){
        observers.remove(observer);
    }
    public void notifyObservers(){
        for(var observer: observers)
            observer.update();
    }
}
