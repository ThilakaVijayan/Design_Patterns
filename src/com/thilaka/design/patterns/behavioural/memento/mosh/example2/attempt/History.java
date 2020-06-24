package com.thilaka.design.patterns.behavioural.memento.mosh.example2.attempt;

import java.util.Stack;

public class History {
    private Stack<DocumentState> stack = new Stack<>();

    public void push(DocumentState state){
        stack.push(state);
    }

    public DocumentState pop(){
        if(stack.isEmpty())
            throw new IllegalStateException();
        return stack.pop();
    }

}
