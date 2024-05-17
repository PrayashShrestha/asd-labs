package edu.mum.cs.cs525.labs.vendingMachine.state;

public interface VendingMachineState {
    void insertCoin();
    void selectItem();
    void dispenseItem();
}
