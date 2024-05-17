package edu.mum.cs.cs525.labs.vendingMachine;

public class Client {
    public static void main(String[] args) {
        VendingMachineContext vendingMachineContext = new VendingMachineContext();

        vendingMachineContext.dispenseItem();
        vendingMachineContext.insertCoin();
    }
}
