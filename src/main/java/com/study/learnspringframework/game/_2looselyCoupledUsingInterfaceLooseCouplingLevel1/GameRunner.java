package com.study.learnspringframework.game._2looselyCoupledUsingInterfaceLooseCouplingLevel1;

public class GameRunner {

    private GamingConsole game;

    public GameRunner(GamingConsole game) {
        this.game =  game;
    }

    public void run() {
        game.up();
        game.down();
        game.left();
        game.right();
    }
}
// Here as u can see the GameRunner class is loosely coupled to MarioGame Class, thus if we want to add another class called ContraGame
// & wants GameRunner to be able to run ContraGame, we do not need to make any changes in existing classes GameRunner & MarioGame.
// It increases the flexibility and re-usability of the code.