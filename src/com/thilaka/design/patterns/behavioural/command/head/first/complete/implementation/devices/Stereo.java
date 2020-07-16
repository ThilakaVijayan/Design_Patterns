package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices;

public class Stereo {
    private String room;
    private int volume;

    public Stereo(String room) {
        this.room = room;
        volume = 0;
    }

    public void on(){
        System.out.println(room + " stereo is on");
    }
    public void off(){
        System.out.println(room + " stereo is off");
    }
    public void setCd(){
        System.out.println(room + " stereo is set for CD input");
    }
    public void setDvd(){
        System.out.println(room + " stereo is set for DVD input");
    }
    public void setRadio(){
        System.out.println(room + " stereo is set on Radio");
    }

    public void setVolume(int volume) {
        System.out.println(room + " stereo Volume set to " + volume);
    }
}
