package edu.mum.cs.cs525.labs.vendingMachine.state;

import edu.mum.cs.cs525.labs.vendingMachine.VendingMachineContext;

public class SelectionState implements VendingMachineState{
    VendingMachineContext vendingMachineContext;

    public SelectionState(VendingMachineContext vendingMachineContext){
        this.vendingMachineContext  = vendingMachineContext;
    }
    @Override
    public void insertCoin() {
        System.out.println("Coin already inserted...");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected...");
        vendingMachineContext.setCurrentState(vendingMachineContext.getDispensingState());
    }

    @Override
    public void dispenseItem() {
        System.out.println("Select an item first...");
    }
}
