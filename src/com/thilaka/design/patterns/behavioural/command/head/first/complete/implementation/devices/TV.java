package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices;

public class TV {
    private String room;
    private int inputChannel;
    private int volume;

    public TV(String room) {
        this.room = room;
    }

    public void on(){
        System.out.println(room + " TV is on");
    }

    public void off(){
        System.out.println(room + " TV is off");
    }

    public void setInputChannel(int channel){
        this.inputChannel = channel;
        System.out.println(room + " TV is switched to " + this.inputChannel);
    }

    public void setVolume(int volume){
        this.volume = volume;
        System.out.println(room + " TV has volume " + this.volume);
    }
}
