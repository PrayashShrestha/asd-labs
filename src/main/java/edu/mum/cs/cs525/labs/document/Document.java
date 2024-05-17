package edu.mum.cs.cs525.labs.document;

import edu.mum.cs.cs525.labs.document.element.Element;
import edu.mum.cs.cs525.labs.document.visitor.Visitor;

import java.util.ArrayList;

public class Document {
    private ArrayList<Element> elements = new ArrayList<>();

    public void addElement(Element element) {
        elements.add(element);
    }

    public void accept(Visitor visitor) {
        elements.forEach(element -> element.accept(visitor));
    }
}
