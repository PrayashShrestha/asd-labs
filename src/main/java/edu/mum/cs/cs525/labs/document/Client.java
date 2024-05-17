package edu.mum.cs.cs525.labs.document;

import edu.mum.cs.cs525.labs.document.element.Element;
import edu.mum.cs.cs525.labs.document.element.Hyperlink;
import edu.mum.cs.cs525.labs.document.element.Image;
import edu.mum.cs.cs525.labs.document.element.PlainText;
import edu.mum.cs.cs525.labs.document.visitor.SpellCheck;
import edu.mum.cs.cs525.labs.document.visitor.Visitor;
import edu.mum.cs.cs525.labs.document.visitor.WordCount;

public class Client {
    public static void main(String[] args) {
        Document document = new Document();

        document.addElement(new Hyperlink("Hyperlink"));
        document.addElement(new Image("Image.jpg"));
        document.addElement(new PlainText("Plain Text"));


        Visitor spellCheck = new SpellCheck();
        Visitor wordCount = new WordCount();

        document.accept(spellCheck);
        document.accept(wordCount);
    }
}
