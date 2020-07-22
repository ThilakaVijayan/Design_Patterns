package com.thilaka.design.patterns.behavioural.observer.telusko;

public interface Subject {
    void subscribe(Observer sub);

    void unSubscribe(Observer sub);

    void notifySubscriber();

    void upload(String title);
}
