package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation;

import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands.*;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.CeilingFan;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.GarageDoor;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.Light;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.Stereo;

//Client
public class Main {
    public static void main(String[] args) {
        var remoteControl = new RemoteControlWithUndo();//Invoker

        var livingRoomLight = new Light("Living Room");
        var kitchenLight = new Light("Kitchen");
        var ceilingFan = new CeilingFan("Living Room");
        var garageDoor = new GarageDoor();
        var stereo = new Stereo("Living Room");

        var livingRoomLightOn = new LightOnCommand(livingRoomLight);//Command
        var livingRoomLightOff = new LightOffCommand(livingRoomLight);
        var kitchenLightOn = new LightOnCommand(kitchenLight);
        var kitchenLightOff = new LightOffCommand(kitchenLight);

        var ceilingFanOn = new CeilingFanHighCommand(ceilingFan);
        var ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        var garageDoorUp = new GarageDoorUpCommand(garageDoor);
        var garageDoorDown = new GarageDoorDownCommand(garageDoor);

        var stereoOnWithCD = new StereoOnWithCDCommand(stereo);
        var stereoOff = new StereoOffCommand(stereo);

        remoteControl.setCommand(0,livingRoomLightOn,livingRoomLightOff);
        remoteControl.setCommand(1,kitchenLightOn,kitchenLightOff);
        remoteControl.setCommand(2,ceilingFanOn,ceilingFanOff);
        remoteControl.setCommand(3,stereoOnWithCD,stereoOff);

        System.out.println(remoteControl);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);
        remoteControl.onButtonWasPushed(1);
        remoteControl.offButtonWasPushed(1);
        remoteControl.onButtonWasPushed(2);
        remoteControl.offButtonWasPushed(2);
        remoteControl.onButtonWasPushed(3);
        remoteControl.offButtonWasPushed(3);
    }
}
