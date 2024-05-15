package edu.mum.cs.cs525.labs.skeleton.fromBook;

public interface State {

    public void insertQuarter();
    public void ejectQuarter();
    public void turnCrank();
    public void dispense();

    public void refill();
}

