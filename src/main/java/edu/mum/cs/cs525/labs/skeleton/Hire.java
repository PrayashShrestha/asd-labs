package edu.mum.cs.cs525.labs.skeleton;

import java.util.function.Consumer;

public abstract class Hire {
    public abstract void accept(Consumer<? super Hire> action);
    public abstract double getSalary();
}

