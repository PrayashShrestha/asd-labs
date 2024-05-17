package edu.mum.cs.cs525.labs.document.element;

import edu.mum.cs.cs525.labs.document.visitor.Visitor;

public class Hyperlink implements Element{
    private String link;

    public Hyperlink(String link) {
        this.link = link;
    }

    public String getLink() {
        return link;
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
