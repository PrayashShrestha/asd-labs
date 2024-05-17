package edu.mum.cs.cs525.labs.document.element;

import edu.mum.cs.cs525.labs.document.visitor.Visitor;

public class Image implements Element{
    private String image;
    public Image(String image) {
        this.image = image;
    }
    public String getImage() {
        return image;
    }
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
