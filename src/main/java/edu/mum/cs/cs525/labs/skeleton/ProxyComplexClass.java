package edu.mum.cs.cs525.labs.skeleton;

public class ProxyComplexClass implements ComplexClass{
    private RealComplexClass realComplexClass;

    @Override
    public void veryComplicatedTask() throws InterruptedException {
        if(realComplexClass == null){
            realComplexClass = new RealComplexClass();
        }
        realComplexClass.veryComplicatedTask();
    }
}
