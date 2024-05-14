package edu.mum.cs.cs525.labs.skeleton;

public class File implements FileSystemComponent{
    private String name;
    private int sizeInBytes;

    public File(String name, int sizeInBytes) {
        this.name = name;
        this.sizeInBytes = sizeInBytes;
    }

    @Override
    public int computeSize() {
        return sizeInBytes;
    }

    @Override
    public void print() {
        System.out.println("--- file " + name + " size=" + sizeInBytes + " bytes");
    }
}
