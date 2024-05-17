package edu.mum.cs.cs525.labs.skeleton;

import java.util.function.Consumer;

public class Employee extends Hire {
    private String name;
    protected double baseSalary;

    public Employee(String name, double baseSalary) {
        this.name = name;
        this.baseSalary = baseSalary;
    }

    @Override
    public void accept(Consumer<? super Hire> action) {
        action.accept(this);
    }

    public String getName() {
        return name;
    }

    public double getSalary() {
        return baseSalary;
    }

    public double getTotalSalary() {
        return getSalary();
    }
}
