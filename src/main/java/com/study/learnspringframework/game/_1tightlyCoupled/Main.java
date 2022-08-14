package com.study.learnspringframework.game._1tightlyCoupled;

public class Main {

    public static void main(String[] args) {
        MarioGame marioGame = new MarioGame();
        //ContraGame contraGame = new ContraGame();
        GameRunner gameRunnerMario = new GameRunner(marioGame);
        //GameRunner gameRunnerContra = new GameRunner(contraGame);
        gameRunnerMario.runMario();
        //gameRunnerContra.runContra();
    }
}