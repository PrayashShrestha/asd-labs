package edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class Manager extends Employee {
    private double bonus;
    private List<Employee> employees = new ArrayList<>();

    public Manager(String name, double baseSalary, double bonus) {
        super(name, baseSalary);
        this.bonus = bonus;
    }

    public void addHire(Employee employee) {
        employees.add(employee);
    }

    @Override
    public void accept(Consumer<? super Hire> action) {
        action.accept(this);
        for (Hire employee : employees) {
            employee.accept(action);
        }
    }

    @Override
    public double getSalary() {
        return super.getSalary() + bonus;
    }

    @Override
    public double getTotalSalary() {
        double total = getSalary();
        for (Employee employee : employees) {
            total += employee.getTotalSalary();
        }
        return total;
    }
}
