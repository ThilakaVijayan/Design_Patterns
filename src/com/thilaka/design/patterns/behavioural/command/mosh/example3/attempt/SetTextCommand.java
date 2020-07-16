package com.thilaka.design.patterns.behavioural.command.mosh.example3.attempt;


import com.thilaka.design.patterns.behavioural.command.mosh.example3.attempt.framework.UndoableCommand;

public class SetTextCommand implements UndoableCommand {
    private String prevText;
    private String text;
    private VideoEditor editor;
    private History history;

    public SetTextCommand(String text, VideoEditor editor, History history) {
        this.text = text;
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
        editor.setText(text);
        history.push(this);
    }
}
