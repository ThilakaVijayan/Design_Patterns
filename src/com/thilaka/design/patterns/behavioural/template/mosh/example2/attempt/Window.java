package com.thilaka.design.patterns.behavioural.template.mosh.example2.attempt;

public class Window extends BaseWindow{

    @Override
    protected void doClose() {
        System.out.println("Removing the window from the screen");
    }
}
