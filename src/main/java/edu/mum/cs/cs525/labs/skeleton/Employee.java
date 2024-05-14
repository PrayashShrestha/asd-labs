package edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Employee extends Hire{
    private String name;
    private double salary;

    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    @Override
    public double getSalary() {
        return salary;
    }

    @Override
    public List<Hire> getSubordinates() {
        return new ArrayList<>(); // Employees have no subordinates
    }

    @Override
    public void accept(Consumer<? super Hire> action) {
        action.accept((Hire) this);
    }
}
