package edu.mum.cs.cs525.labs.vendingMachine.state;

import edu.mum.cs.cs525.labs.vendingMachine.VendingMachineContext;

public class ReadyState implements VendingMachineState{
    VendingMachineContext vendingMachineContext;

    public ReadyState(VendingMachineContext vendingMachineContext) {
        this.vendingMachineContext = vendingMachineContext;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin Inserted");
        vendingMachineContext.setCurrentState(vendingMachineContext.getSelectionState());
    }

    @Override
    public void selectItem() {
        System.out.println("Insert a coin first...");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Select an item first...");
    }
}
