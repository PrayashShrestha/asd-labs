package edu.mum.cs.cs525.labs.compositeIterator.visitor;

import edu.mum.cs.cs525.labs.compositeIterator.component.Component;

public interface Visitor {
    void visit(Component component);
}
