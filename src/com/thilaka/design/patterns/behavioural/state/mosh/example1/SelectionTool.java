package com.thilaka.design.patterns.behavioural.state.mosh.example1;

public class SelectionTool implements Tool{
    @Override
    public void mouseDown() {
        System.out.println("Selection icon");
    }

    @Override
    public void mouseUp() {
        System.out.println("Draw a dashed rectangle");
    }
}
