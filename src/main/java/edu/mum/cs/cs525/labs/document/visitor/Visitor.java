package edu.mum.cs.cs525.labs.document.visitor;

import edu.mum.cs.cs525.labs.document.element.Hyperlink;
import edu.mum.cs.cs525.labs.document.element.Image;
import edu.mum.cs.cs525.labs.document.element.PlainText;

public interface Visitor {
    void visit(PlainText plainText);
    void visit(Image image);
    void visit(Hyperlink hyperlink);
}
