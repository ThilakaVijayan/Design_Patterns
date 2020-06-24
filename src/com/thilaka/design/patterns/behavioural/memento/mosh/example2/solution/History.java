package com.thilaka.design.patterns.behavioural.memento.mosh.example2.solution;

import java.util.ArrayDeque;
import java.util.Deque;

public class History {
  private Deque<DocumentMemento> mementos = new ArrayDeque<>();

  public void push(DocumentMemento memento) {
    mementos.push(memento);
  }

  public DocumentMemento pop() {
    return mementos.pop();
  }
}
