package edu.mum.cs.cs525.labs.skeleton;

import java.util.List;
import java.util.function.Consumer;

public abstract class Hire {
    public abstract double getSalary();
    public void add(Hire hire){
        throw new UnsupportedOperationException();
    }
    public void remove(Hire hire){
        throw new UnsupportedOperationException();
    }
    public abstract List<Hire> getSubordinates();
    public abstract void accept(Consumer<? super Hire> action);
}
