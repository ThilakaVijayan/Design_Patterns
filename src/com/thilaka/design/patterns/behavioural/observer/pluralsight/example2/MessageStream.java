package com.thilaka.design.patterns.behavioural.observer.pluralsight.example2;

import java.util.ArrayDeque;
import java.util.Deque;

public class MessageStream extends Subject{
    private Deque<String> messageHistory = new ArrayDeque<>();

    @Override
    void setState(String message) {
        messageHistory.add(message);
        this.notifyObserver();
    }

    @Override
    String getState() {
        return messageHistory.getLast();
    }
}
