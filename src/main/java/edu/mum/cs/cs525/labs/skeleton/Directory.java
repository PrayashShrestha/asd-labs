package edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.Collection;

public class Directory implements FileSystemComponent{
    protected String name;
    protected Collection<FileSystemComponent> components = new ArrayList<>();

    public Directory(String name) {
        this.name = name;
    }

    public void addComponent(FileSystemComponent component) {
        components.add(component);
    }

    @Override
    public int computeSize() {
        int sizeInBytes = 0;
        for (FileSystemComponent component : components) {
            sizeInBytes += component.computeSize();
        }
        return sizeInBytes;
    }

    @Override
    public void print() {
        System.out.println("-- dir " + name + " size=" + computeSize() + " bytes");
        for (FileSystemComponent component : components) {
            component.print();
        }
    }

}
