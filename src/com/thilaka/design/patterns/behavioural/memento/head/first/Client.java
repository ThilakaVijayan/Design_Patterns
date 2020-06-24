package com.thilaka.design.patterns.behavioural.memento.head.first;

//a game class. When new level is reached, the state is
//saved. and the game restarts from the saved state, when the
//player gets out.
public class Client {
    public static void main(String[] args) {
        MasterGameObject mgo = new MasterGameObject();
        mgo.setGameState("Level 13 reached");

        System.out.println("Game state               :"+mgo);

        //When new level is reached
        GameMemento saved = mgo.getCurrentState();

        mgo.setGameState("Game Over!");
        System.out.println("Game state after got out :"+mgo);

        //when a restore is required
        mgo.restoreState(saved);
        System.out.println("Game state after restore :"+mgo);
    }
}
