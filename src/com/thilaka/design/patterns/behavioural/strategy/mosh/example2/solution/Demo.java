package com.thilaka.design.patterns.behavioural.strategy.mosh.example2.solution;

public class Demo {
    public static void show() {
        var client = new ChatClient(new DES());
        client.send("Hello World");
    }
}
