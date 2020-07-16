package com.thilaka.design.patterns.behavioural.command.pluralsight.example2.improvement2;

//invoker
public class Switch {

    public void storeAndExecute(Command command){
        command.execute();
    }
}
