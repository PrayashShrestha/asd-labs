package edu.mum.cs.cs525.labs.vendingMachine;

import edu.mum.cs.cs525.labs.vendingMachine.state.DispensingState;
import edu.mum.cs.cs525.labs.vendingMachine.state.ReadyState;
import edu.mum.cs.cs525.labs.vendingMachine.state.SelectionState;
import edu.mum.cs.cs525.labs.vendingMachine.state.VendingMachineState;

public class VendingMachineContext {
    VendingMachineState currentState = new ReadyState(this);
    VendingMachineState readyState = new ReadyState(this);
    VendingMachineState selectionState = new SelectionState(this);
    VendingMachineState dispensingState = new DispensingState(this);

    /**/
    public VendingMachineState getCurrentState() {
        return currentState;
    }
    public VendingMachineState getReadyState() {
        return readyState;
    }
    public VendingMachineState getSelectionState() {
        return selectionState;
    }
    public VendingMachineState getDispensingState() {
        return dispensingState;
    }

    public void setCurrentState(VendingMachineState currentState) {
        this.currentState = currentState;
    }

    public void insertCoin(){
        currentState.insertCoin();
    }

    public void selectItem(){
        currentState.selectItem();
    }

    public void dispenseItem(){
        currentState.dispenseItem();
    }
}
