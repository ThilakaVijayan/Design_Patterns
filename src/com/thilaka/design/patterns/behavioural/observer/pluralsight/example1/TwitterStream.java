package com.thilaka.design.patterns.behavioural.observer.pluralsight.example1;

import java.util.Observable;

public class TwitterStream extends Observable {


    public void someoneTweeted(){
        setChanged();
        notifyObservers();
    }
}
