package com.thilaka.design.patterns.behavioural.command.mosh.example3.attempt;

import com.thilaka.design.patterns.behavioural.command.mosh.example3.attempt.framework.UndoableCommand;

public class ContrastCommand implements UndoableCommand {
    private float prevContrast;
    private float contrast;
    private VideoEditor editor;
    private History history;

    public ContrastCommand(float contrast, VideoEditor editor, History history) {
        this.contrast = contrast;
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void unexecute() {
        editor.setContrast(prevContrast);
    }

    @Override
    public void execute() {
        prevContrast = editor.getContrast();
        editor.setContrast(contrast);
        history.push(this);
    }
}
