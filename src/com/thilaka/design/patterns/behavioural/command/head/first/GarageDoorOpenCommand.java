package com.thilaka.design.patterns.behavioural.command.head.first;

public class GarageDoorOpenCommand implements Command{
    private GarageDoor door;

    public GarageDoorOpenCommand(GarageDoor door) {
        this.door = door;
    }

    @Override
    public void execute() {
        door.up();
    }
}
