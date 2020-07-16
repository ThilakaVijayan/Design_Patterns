package com.thilaka.design.patterns.behavioural.command.pluralsight.example2.improvement2;

//receiver
public class Light {
    private boolean isOn = false;

    public void toggle(){
        if (isOn)
            off();
        else
            on();

    }

    private void on(){
        isOn = true;
        System.out.println("Light switched on.");
    }

    private void off(){
        isOn = false;
        System.out.println("Light switched off.");
    }
}
