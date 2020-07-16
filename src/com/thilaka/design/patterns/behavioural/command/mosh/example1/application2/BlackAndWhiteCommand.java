package com.thilaka.design.patterns.behavioural.command.mosh.example1.application2;

import com.thilaka.design.patterns.behavioural.command.mosh.example1.framework.Command;

public class BlackAndWhiteCommand implements Command {
    @Override
    public void execute() {
        System.out.println("Black and White");
    }
}
