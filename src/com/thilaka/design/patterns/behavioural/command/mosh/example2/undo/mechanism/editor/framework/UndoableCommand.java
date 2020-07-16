package com.thilaka.design.patterns.behavioural.command.mosh.example2.undo.mechanism.editor.framework;

public interface UndoableCommand extends Command{
    void unexecute();
}
