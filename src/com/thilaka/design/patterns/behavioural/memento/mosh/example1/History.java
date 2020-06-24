package com.thilaka.design.patterns.behavioural.memento.mosh.example1;

import java.util.ArrayList;
import java.util.List;

//This class will store the states in a list
//push or pop are used while saving a new state or undo
public class History {

    private List<EditorState> states = new ArrayList<>();

    public void push(EditorState state){
        states.add(state);
    }

    public EditorState pop(){
        var lastIndex = states.size() - 1;
        var lastState = states.get(lastIndex);
        states.remove(lastState);

        return lastState;

    }
}
