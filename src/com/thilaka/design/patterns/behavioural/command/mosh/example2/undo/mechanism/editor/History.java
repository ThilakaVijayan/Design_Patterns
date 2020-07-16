package com.thilaka.design.patterns.behavioural.command.mosh.example2.undo.mechanism.editor;

import com.thilaka.design.patterns.behavioural.command.mosh.example2.undo.mechanism.editor.framework.UndoableCommand;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
    private Deque<UndoableCommand> commands = new ArrayDeque<>();

    public void push(UndoableCommand command){
        commands.add(command);
    }

    public UndoableCommand pop(){
        return commands.pop();
    }

    public int size(){
        return commands.size();
    }

}
