package edu.mum.cs.cs525.labs.document.visitor;

import edu.mum.cs.cs525.labs.document.element.Hyperlink;
import edu.mum.cs.cs525.labs.document.element.Image;
import edu.mum.cs.cs525.labs.document.element.PlainText;

public class WordCount implements Visitor{
    @Override
    public void visit(PlainText plainText) {
        System.out.println("Word count: " + plainText.getClass().getName().toUpperCase());
    }

    @Override
    public void visit(Image image) {
        System.out.println("No word count: "+image.getClass().getName().toUpperCase());
    }

    @Override
    public void visit(Hyperlink hyperlink) {
        System.out.println("Word count: " + hyperlink.getClass().getName().toUpperCase());
    }
}
