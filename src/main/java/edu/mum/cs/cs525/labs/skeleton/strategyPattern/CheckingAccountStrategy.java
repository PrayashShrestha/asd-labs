package edu.mum.cs.cs525.labs.skeleton.strategyPattern;

public class CheckingAccountStrategy implements AccountTypeStrategy{
    @Override
    public Double calculateInterest(Double balance) {
        if(balance < 1000){
            return (balance * 1.5)/100;
        }
        return (balance * 2.5)/100;
    }
}
