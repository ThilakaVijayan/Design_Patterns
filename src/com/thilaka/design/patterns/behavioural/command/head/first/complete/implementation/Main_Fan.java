package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation;

import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands.CeilingFanHighCommand;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands.CeilingFanMediumCommand;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands.CeilingFanOffCommand;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.CeilingFan;

public class Main_Fan {
    public static void main(String[] args) {
        var remoteControl = new RemoteControlWithUndo();
        var ceilingFan = new CeilingFan("Living Room");

        var ceilingFanMedium = new CeilingFanMediumCommand(ceilingFan);
        var ceilingFanHigh = new CeilingFanHighCommand(ceilingFan);
        var ceilingFanOff = new CeilingFanOffCommand(ceilingFan);

        remoteControl.setCommand(0,ceilingFanMedium,ceilingFanOff);
        remoteControl.setCommand(1,ceilingFanHigh,ceilingFanOff);

        remoteControl.onButtonWasPushed(0);
        remoteControl.offButtonWasPushed(0);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();

        remoteControl.onButtonWasPushed(1);

        System.out.println(remoteControl);

        remoteControl.undoButtonWasPushed();
    }
}
