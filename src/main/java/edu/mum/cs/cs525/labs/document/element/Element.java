package edu.mum.cs.cs525.labs.document.element;

import edu.mum.cs.cs525.labs.document.visitor.Visitor;

public interface Element {
    void accept(Visitor visitor);
}
