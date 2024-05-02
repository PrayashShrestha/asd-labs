package edu.mum.cs.cs525.labs.skeleton.decoratorPattern;

import edu.mum.cs.cs525.labs.skeleton.strategyPattern.AccountTypeStrategy;

public abstract class AccountTypePromotionDecorator implements AccountTypeStrategy {
    protected AccountTypeStrategy accountTypeStrategy;

    public abstract Double calculateInterest(Double balance);

    public void setAccountTypeStrategy(AccountTypeStrategy accountTypeStrategy) {
        this.accountTypeStrategy = accountTypeStrategy;
    }
}
