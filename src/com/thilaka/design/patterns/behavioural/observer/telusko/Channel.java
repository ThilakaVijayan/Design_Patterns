package com.thilaka.design.patterns.behavioural.observer.telusko;

import java.util.ArrayList;
import java.util.List;

public class Channel implements Subject {
    private List<Observer> subs = new ArrayList<>();

    private String title;

    @Override
    public void subscribe(Observer sub){
        subs.add(sub);
    }

    @Override
    public void unSubscribe(Observer sub){
        subs.remove(sub);
    }
    @Override
    public void notifySubscriber(){
        for(Observer sub: subs){
            sub.update();
        }
    }
    @Override
    public void upload(String title){
        this.title = title;
        notifySubscriber();
    }

    public String getTitle() {
        return title;
    }
}
