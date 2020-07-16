package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands;

import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.Command;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.Hottub;

public class HottubOffCommand implements Command {
    private Hottub hottub;

    public HottubOffCommand(Hottub hottub) {
        this.hottub = hottub;
    }

    @Override
    public void execute() {
        hottub.jetsOff();
    }

    @Override
    public void undo() {
        hottub.jetsOn();
    }
}
