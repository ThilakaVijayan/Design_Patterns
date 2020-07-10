package com.thilaka.design.patterns.behavioural.template.mosh.example2.attempt;

public abstract class BaseWindow {

    public void close(){
        System.out.println("Tasks before closing is executed");
        doClose();
        System.out.println("Tasks after closing is executed");

    }
    protected abstract void doClose();
}
