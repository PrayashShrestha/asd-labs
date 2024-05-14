package edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

class Manager extends Hire {
    private String name;
    private double salary;
    private List<Hire> subordinates;

    public Manager(String name, double salary) {
        this.name = name;
        this.salary = salary;
        this.subordinates = new ArrayList<>();
    }

    @Override
    public double getSalary() {
        double totalSalary = salary;
        for (Hire subordinate : subordinates) {
            totalSalary += subordinate.getSalary();
        }
        return totalSalary;
    }

    @Override
    public void add(Hire hire) {
        subordinates.add(hire);
    }

    @Override
    public void remove(Hire hire) {
        subordinates.remove(hire);
    }

    @Override
    public List<Hire> getSubordinates() {
        return subordinates;
    }

    @Override
    public void accept(Consumer<? super Hire> action) {
        action.accept(this);
        for (Hire subordinate : subordinates) {
            subordinate.accept(action);
        }
    }
}
