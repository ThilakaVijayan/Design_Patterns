package com.thilaka.design.patterns.behavioural.observer.head.first;

import java.util.ArrayList;

public class WeatherData implements Subject{
    private ArrayList<Observer> observers;
    private float temperature;
    private float humidity;
    private float pressure;

    public WeatherData() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
       observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer:observers)
            observer.update(temperature,humidity,pressure);
    }

    public void measurementsChanged(){
        notifyObservers();
    }

    public void setMeasurements(float temperature,float humidity,float pressure){
        this.temperature = temperature;
        this.humidity = humidity;
        this.pressure = pressure;
        measurementsChanged();
    }
}
