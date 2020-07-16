package com.thilaka.design.patterns.behavioural.command.mosh.example3.attempt;

public class Main {
    public static void main(String[] args) {
        var editor = new VideoEditor();
        var history = new History();

        var setTxt = new SetTextCommand("Hello",editor,history);
        setTxt.execute();
        System.out.println(editor);

        var contrast = new ContrastCommand(5,editor,history);
        contrast.execute();
        System.out.println(editor);

        var removeText = new RemoveTextCommand(editor,history);
        removeText.execute();
        System.out.println(editor);

        var undo = new UndoCommand(history);
        undo.execute();
        System.out.println(editor);


    }
}
