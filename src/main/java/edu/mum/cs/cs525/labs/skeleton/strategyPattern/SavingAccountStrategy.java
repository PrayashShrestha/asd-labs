package edu.mum.cs.cs525.labs.skeleton.strategyPattern;

public class SavingAccountStrategy implements AccountTypeStrategy{
    @Override
    public Double calculateInterest(Double balance) {
        if(balance < 1000){
            return (balance)/100;
        }
        if(balance > 1000 & balance < 5000){
            return (balance * 2)/100;
        }
        return (balance * 4)/100;
    }
}
