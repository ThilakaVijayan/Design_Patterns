package com.thilaka.design.patterns.behavioural.command.mosh.example2.undo.mechanism.editor;

public class Main {
    public static void main(String[] args) {
        var history = new History();
        var document = new HtmlDocument();
        document.setContent("Hello World");

        var boldCommand = new BoldCommand(document,history);
        boldCommand.execute();

        System.out.println(document.getContent());

        //boldCommand.unexecute();
        var undoCommand = new UndoCommand(history);
        undoCommand.execute();
        System.out.println(document.getContent());
    }
}
