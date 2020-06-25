package com.thilaka.design.patterns.behavioural.state.mosh.example1;

public class Canvas {

    private Tool currentTool;

    public void mouseDown(){
        currentTool.mouseDown();
    }
    public void mouseUp(){
        currentTool.mouseUp();
    }


    public Tool getCurrentTool() {
        return currentTool;
    }

    public void setCurrentTool(Tool currentTool) {
        this.currentTool = currentTool;
    }
}
