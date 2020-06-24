package com.thilaka.design.patterns.behavioural.memento.head.first;

public class GameMemento {

    private String savedGameState;

    public GameMemento(String savedGameState) {
        this.savedGameState = savedGameState;
    }

    public String getSavedGameState() {
        return savedGameState;
    }
}
