package edu.mum.cs.cs525.labs.document.element;

import edu.mum.cs.cs525.labs.document.visitor.Visitor;

public class PlainText implements Element{

    private String text;

    public PlainText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
