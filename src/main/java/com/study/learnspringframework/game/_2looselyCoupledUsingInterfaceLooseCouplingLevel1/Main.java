package com.study.learnspringframework.game._2looselyCoupledUsingInterfaceLooseCouplingLevel1;

public class Main {

    public static void main(String[] args) {
        GamingConsole marioGame = new MarioGame();
        GamingConsole contraGame = new ContraGame();

        GameRunner gameRunnerMario = new GameRunner(marioGame);
        GameRunner gameRunnerContra = new GameRunner(contraGame);

        gameRunnerMario.run(); // Runs Mario game
        gameRunnerContra.run(); // Runs contra game

    }
}