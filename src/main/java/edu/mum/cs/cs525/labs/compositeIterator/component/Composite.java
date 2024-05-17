package edu.mum.cs.cs525.labs.compositeIterator.component;

import edu.mum.cs.cs525.labs.compositeIterator.visitor.Visitor;

import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Composite extends Component{
    private Collection<Component> components = new LinkedList<>();
    public void addComponent(Component c) {
        components.add(c);
    }
    public void removeComponent(Component c) {
        components.remove(c);
    }
    @Override
    public void accept(Visitor v) {
        v.visit(this);
        for(Component c : components) {
            c.accept(v);
        }
    }

    @Override
    public Iterator<Component> iterator() {
        return null;
    }

    @Override
    public void forEach(Consumer<? super Component> action) {
        super.forEach(action);
    }

    @Override
    public Spliterator<Component> spliterator() {
        return super.spliterator();
    }
}
