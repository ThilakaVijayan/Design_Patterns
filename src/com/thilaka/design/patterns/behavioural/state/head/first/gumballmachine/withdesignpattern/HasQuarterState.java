package com.thilaka.design.patterns.behavioural.state.head.first.gumballmachine.withdesignpattern;

import java.util.Random;

public class HasQuarterState implements State{
    Random randomWinner = new Random(System.currentTimeMillis());
    GumballMachine gumballMachine;

    public HasQuarterState(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void insertQuarter() {
        System.out.println("You can't insert another quarter");
    }

    @Override
    public void ejectQuarter() {
        System.out.println("Quarter returned");
        gumballMachine.setState(gumballMachine.getNoQuarterState());
    }

    @Override
    public boolean turnCrank() {
        System.out.println("You turned...");
        int winner = randomWinner.nextInt(10);
        if((winner == 0) &&
                (gumballMachine.getCount() >= WinnerState.NUMBER_OF_GUMBALLS_FOR_WINNER))
            gumballMachine.setState(gumballMachine.getWinnerState());
        else
            gumballMachine.setState(gumballMachine.getSoldState());
        return true;
    }

    @Override
    public void dispense() {
        System.out.println("No gumball dispensed");

    }
}
