package com.study.learnspringframework.game._1tightlyCoupled;

public class GameRunner {

    private MarioGame marioGame;

    public GameRunner(MarioGame marioGame) {
        this.marioGame =  marioGame;
    }

    public void runMario() {
        marioGame.up();
        marioGame.down();
        marioGame.left();
        marioGame.right();
    }
}
// Here as u can see the GameRunner class is tightly coupled to MarioGame Class thus if we want to add another class called ContraGame &
// wants GameRunner to be able to run ContraGame, we need to make a new/additional data member, constructor & run method in the GameRunner class,
// so it can work with ContraGame object as well. It reduces the flexibility and re-usability of the code.