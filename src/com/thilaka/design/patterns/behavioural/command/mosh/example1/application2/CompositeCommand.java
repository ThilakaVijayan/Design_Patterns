package com.thilaka.design.patterns.behavioural.command.mosh.example1.application2;

import com.thilaka.design.patterns.behavioural.command.mosh.example1.framework.Command;

import java.util.ArrayList;
import java.util.List;

public class CompositeCommand implements Command {
    private List<Command> commands = new ArrayList<>();

    public void add(Command command){
        commands.add(command);
    }

    @Override
    public void execute() {
        for(var command: commands)
            command.execute();
    }
}
