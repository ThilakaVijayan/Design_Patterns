package com.thilaka.design.patterns.behavioural.observer.telusko;

public interface Observer {
    void update();

    void subscribeChannel(Channel channel);
}
