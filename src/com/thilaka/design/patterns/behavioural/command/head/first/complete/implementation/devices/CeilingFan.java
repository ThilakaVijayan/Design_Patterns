package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices;

public class CeilingFan {
    public static final int HIGH = 3;
    public static final int MEDIUM = 2;
    public static final int LOW = 1;
    public static final int OFF = 0;

    private int speed;
    private String room;

    public CeilingFan(String room) {
        this.room = room;
        speed = OFF;
    }

    public void high(){
        speed = HIGH;
        System.out.println(room + " ceiling fan is on high");
    }

    public void medium(){
        speed = MEDIUM;
        System.out.println(room + " ceiling fan is on medium");
    }

    public void low(){
        speed = LOW;
        System.out.println(room + " ceiling fan is on low");
    }

    public void off(){
        speed = OFF;
        System.out.println(room + " ceiling fan is off");
    }

    public int getSpeed(){
        return speed;
    }
}
