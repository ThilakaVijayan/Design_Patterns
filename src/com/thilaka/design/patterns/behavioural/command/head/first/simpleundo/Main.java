package com.thilaka.design.patterns.behavioural.command.head.first.simpleundo;

//Client
public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControlWithUndo();//Invoker

        var livingRoomLight = new Light("Living Room");


        var livingRoomLightOn = new LightOnCommand(livingRoomLight);//Command
        var livingRoomLightOff = new LightOffCommand(livingRoomLight);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }
}
