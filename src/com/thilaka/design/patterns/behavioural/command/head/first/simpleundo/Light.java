package com.thilaka.design.patterns.behavioural.command.head.first.simpleundo;

public class Light {
    private String room;

    public Light(String room) {
        this.room = room;
    }

    public  void on(){
        System.out.println(room + " light is On");
    }

    public  void off(){
        System.out.println(room + " light is Off");
    }
}
