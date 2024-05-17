package edu.mum.cs.cs525.labs.vendingMachine.state;

import edu.mum.cs.cs525.labs.vendingMachine.VendingMachineContext;

public class DispensingState implements VendingMachineState{
    VendingMachineContext vendingMachineContext;

    public DispensingState(VendingMachineContext vendingMachineContext) {
        this.vendingMachineContext = vendingMachineContext;
    }

    @Override
    public void insertCoin() {
        System.out.println("Coin inserted already...");
    }

    @Override
    public void selectItem() {
        System.out.println("Item selected already...");
    }

    @Override
    public void dispenseItem() {
        System.out.println("Item dispensing...");
        vendingMachineContext.setCurrentState(vendingMachineContext.getReadyState());
    }
}
