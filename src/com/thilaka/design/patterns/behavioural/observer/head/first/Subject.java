package com.thilaka.design.patterns.behavioural.observer.head.first;

public interface Subject {
    void registerObserver(Observer o);
    void removeObserver(Observer o);
    void notifyObservers();
}
