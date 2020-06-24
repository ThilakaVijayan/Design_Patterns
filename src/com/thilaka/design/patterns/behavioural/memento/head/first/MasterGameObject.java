package com.thilaka.design.patterns.behavioural.memento.head.first;

public class MasterGameObject {
    private String gameState;

    public GameMemento getCurrentState(){
        return new GameMemento(gameState);
    }

    public void restoreState(GameMemento savedSate){
        gameState = savedSate.getSavedGameState();

    }

    @Override
    public String toString() {
        return gameState;
    }

    public String getGameState() {
        return gameState;
    }

    public void setGameState(String gameState) {
        this.gameState = gameState;
    }
}
