package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands;

import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.Command;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.TV;

public class TVOffCommand implements Command {
    private TV tv;

    public TVOffCommand(TV tv) {
        this.tv = tv;
    }

    @Override
    public void execute() {
        tv.off();
    }

    @Override
    public void undo() {
        tv.on();
    }
}
