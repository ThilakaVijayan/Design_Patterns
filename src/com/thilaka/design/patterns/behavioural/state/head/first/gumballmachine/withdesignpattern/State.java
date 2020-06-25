package com.thilaka.design.patterns.behavioural.state.head.first.gumballmachine.withdesignpattern;

public interface State {
    void insertQuarter();
    void ejectQuarter();
    boolean turnCrank();
    void dispense();
}
