package com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.commands;

import com.thilaka.design.patterns.behavioural.command.head.first.complete.implementation.Command;

import java.util.Arrays;

public class MacroCommand implements Command {
    private Command[] commands;

    public MacroCommand(Command[] commands) {
        this.commands = commands;
    }

    @Override
    public void execute() {
        for (var command : commands)
            command.execute();
    }

    @Override
    public void undo() {
        Arrays.stream(commands).forEach(Command::undo);//use streams instead of for loops.
        //for (var command : commands)
        //            command.undo();
    }
}
