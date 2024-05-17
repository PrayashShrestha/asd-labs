package edu.mum.cs.cs525.labs.document.visitor;

import edu.mum.cs.cs525.labs.document.element.Hyperlink;
import edu.mum.cs.cs525.labs.document.element.Image;
import edu.mum.cs.cs525.labs.document.element.PlainText;

public class SpellCheck implements Visitor{
    @Override
    public void visit(PlainText plainText) {
        System.out.println("...Spell Check in "+plainText.getClass().getName().toUpperCase());
    }

    @Override
    public void visit(Image image) {
        System.out.println("...No spell check in "+image.getClass().getName().toUpperCase());
    }

    @Override
    public void visit(Hyperlink hyperlink) {
        System.out.println("...Spell Check in "+hyperlink.getClass().getName().toUpperCase());
    }
}
