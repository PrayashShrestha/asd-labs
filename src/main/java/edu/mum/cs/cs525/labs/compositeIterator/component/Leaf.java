package edu.mum.cs.cs525.labs.compositeIterator.component;

import edu.mum.cs.cs525.labs.compositeIterator.visitor.Visitor;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class Leaf extends Component{
    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
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
