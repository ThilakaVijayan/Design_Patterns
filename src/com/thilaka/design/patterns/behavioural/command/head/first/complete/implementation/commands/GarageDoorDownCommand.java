package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands;

import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.Command;
import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.devices.GarageDoor;

public class GarageDoorDownCommand implements Command {
    private GarageDoor door;

    public GarageDoorDownCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.down();
    }

    @Override
    public void undo() {
        door.up();
    }
}
