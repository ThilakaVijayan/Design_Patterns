package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation;



import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands.*;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.Hottub;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.Light;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.Stereo;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.TV;

public class Main_Party {
    public static void main(String[] args) {
        var light = new Light("Living Room");
        var tv = new TV("Living Room");
        var stereo = new Stereo("Living Room");
        var hottub = new Hottub();

        var lightOn = new LightOnCommand(light);
        var stereoOn = new StereoOnWithCDCommand(stereo);
        var tvOn = new TVOnCommand(tv);
        var hottubOn = new HottubOnCommand(hottub);

        var lightOff = new LightOffCommand(light);
        var stereoOff = new StereoOffCommand(stereo);
        var tvOff = new TVOffCommand(tv);
        var hottubOff = new HottubOffCommand(hottub);

        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};

        var partyOnMacro = new MacroCommand(partyOn);
        var partyOffMacro = new MacroCommand(partyOff);

        var remoteControl = new RemoteControlWithUndo();
        remoteControl.setCommand(0,partyOnMacro,partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On ---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off ---");
        remoteControl.offButtonWasPushed(0);
    }
}
