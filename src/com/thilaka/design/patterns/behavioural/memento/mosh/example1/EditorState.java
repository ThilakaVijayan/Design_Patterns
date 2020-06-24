package com.thilaka.design.patterns.behavioural.memento.mosh.example1;

//This class will save the state of the current state.
//Then this state needs to be stored in the history as a list.
public class EditorState {
    //This field is final, so that it is not modified by accident.
    private final String content;

    public EditorState(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
