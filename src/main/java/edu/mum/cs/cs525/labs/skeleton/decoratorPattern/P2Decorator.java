package edu.mum.cs.cs525.labs.skeleton.decoratorPattern;

import edu.mum.cs.cs525.labs.skeleton.strategyPattern.AccountTypeStrategy;

public class P2Decorator extends AccountTypePromotionDecorator {
    public P2Decorator(AccountTypeStrategy accountTypeStrategy) {
        this.setAccountTypeStrategy(accountTypeStrategy);
    }

    @Override
    public Double calculateInterest(Double balance) {
        return accountTypeStrategy.calculateInterest(balance) + (balance*2/100);
    }
}
