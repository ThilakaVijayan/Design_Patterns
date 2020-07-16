package com.thilaka.design.patterns.behavioural.command.mosh.example3.attempt;


import com.thilaka.design.patterns.behavioural.command.mosh.example3.attempt.framework.UndoableCommand;

public class RemoveTextCommand implements UndoableCommand {
    private String prevText;
    private VideoEditor editor;
    private History history;

    public RemoveTextCommand(VideoEditor editor, History history) {
        this.editor = editor;
        this.history = history;
    }

    @Override
    public void unexecute() {
        editor.setText(prevText);
    }

    @Override
    public void execute() {
        prevText = editor.getText();
        editor.removeText();
        history.push(this);
    }
}
