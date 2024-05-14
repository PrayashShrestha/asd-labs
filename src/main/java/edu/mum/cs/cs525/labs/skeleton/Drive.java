package edu.mum.cs.cs525.labs.skeleton;

import java.util.ArrayList;
import java.util.Collection;

public class Drive implements FileSystemComponent{
    protected String name;
    protected Collection<FileSystemComponent> components = new ArrayList<>();

    public Drive(String name) {
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
        System.out.println("- drive " + name);
        for (FileSystemComponent component : components) {
            component.print();
        }
    }
}
