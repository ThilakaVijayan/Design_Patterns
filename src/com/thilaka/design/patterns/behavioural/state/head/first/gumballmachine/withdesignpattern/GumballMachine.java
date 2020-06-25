package com.thilaka.design.patterns.behavioural.state.head.first.gumballmachine.withdesignpattern;

public class GumballMachine {
   State soldOutState;
   State noQuarterState;
   State hasQuarterState;
   State soldState;
   State winnerState;

    State state = soldOutState;
    int count;

    public GumballMachine(int numberGumballs) {
        soldOutState = new SoldOutState(this);
        noQuarterState = new NoQuarterState(this);
        hasQuarterState = new HasQuarterState(this);
        soldState = new SoldState(this);
        winnerState = new WinnerState(this);

        this.count = numberGumballs;
        if (numberGumballs > 0)
            state = noQuarterState;
    }

    public void insertQuarter(){
        state.insertQuarter();
    }

    public void ejectQuarter(){
        state.ejectQuarter();
    }

    public void turnCrank(){
        if (state.turnCrank())
            state.dispense();
    }

    public void refill(int count){
        this.count+= count;
        System.out.println("Added " +  count + " gumball to the machine");
        if(state == soldOutState)
            state = noQuarterState;
    }

    public void releaseBall(int count){
        for(int i =1; i <= count; i++) {
            System.out.println("A gumball comes rolling out the slot...");
            if (this.count == 0)
                break;
            this.count--;
        }
    }

    @Override
    public String toString() {
        StringBuilder returnString = new StringBuilder("\nMighty Gumball, Inc.\n" +
                "Java-enabled Standing Gumball Model # 2020\n" +
                "Inventory: " + count + " gumballs\n");
        if(state == soldOutState){
            returnString.append("Machine is sold out\n");
        }else if(state == noQuarterState){
            returnString.append("Machine is waiting for quarter\n");
        }else if(state == hasQuarterState){
            returnString.append("Machine has a quarter\n");
        }else if(state == soldState){
            returnString.append("Machine is dispensing gumball\n");
        }else if(state == winnerState){
            returnString.append("Machine has choose you as a winner\n");
        }
        return returnString.toString();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getSoldOutState() {
        return soldOutState;
    }

    public State getNoQuarterState() {
        return noQuarterState;
    }

    public State getHasQuarterState() {
        return hasQuarterState;
    }

    public State getSoldState() {
        return soldState;
    }

    public State getWinnerState() {
        return winnerState;
    }

    public int getCount() {
        return count;
    }
}
