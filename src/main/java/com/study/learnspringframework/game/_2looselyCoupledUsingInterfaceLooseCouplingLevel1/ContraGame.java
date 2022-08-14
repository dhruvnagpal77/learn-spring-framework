package com.study.learnspringframework.game._2looselyCoupledUsingInterfaceLooseCouplingLevel1;

public class ContraGame implements GamingConsole {

    @Override
    public void up() {
        System.out.println("Contra up");
    }

    @Override
    public void down() {
        System.out.println("Contra down");
    }

    @Override
    public void left() {
        System.out.println("Contra left");
    }

    @Override
    public void right() {
        System.out.println("Contra right");
    }
}