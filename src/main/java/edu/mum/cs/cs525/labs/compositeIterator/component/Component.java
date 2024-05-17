package edu.mum.cs.cs525.labs.compositeIterator.component;

import edu.mum.cs.cs525.labs.compositeIterator.visitor.Visitor;

public abstract class Component implements Iterable<Component> {
    public abstract void accept(Visitor visitor);
}
