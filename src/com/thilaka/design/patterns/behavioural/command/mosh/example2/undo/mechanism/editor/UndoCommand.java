package com.thilaka.design.patterns.behavioural.command.mosh.example2.undo.mechanism.editor;


import com.thilaka.design.patterns.behavioural.command.mosh.example2.undo.mechanism.editor.framework.Command;

public class UndoCommand implements Command {
    private History history;

    public UndoCommand(History history) {
        this.history = history;
    }

    @Override
    public void execute() {
        if (history.size()>0)
            history.pop().unexecute();
    }
}
