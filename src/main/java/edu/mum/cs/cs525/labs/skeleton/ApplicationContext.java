package edu.mum.cs.cs525.labs.skeleton;

public class ApplicationContext {
    public static void main(String[] args) throws InterruptedException {
        ProxyComplexClass proxyComplexClass = new ProxyComplexClass();
        double startTime;
        double endTime;

        /* for the first time operation it's the lazy loading... */
        startTime = System.currentTimeMillis();
        proxyComplexClass.veryComplicatedTask();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for first instance: " + (endTime - startTime));

        /* for the second time operation it's not the lazy loading... */
        System.out.println("----------------------");
        startTime = System.currentTimeMillis();
        proxyComplexClass.veryComplicatedTask();
        endTime = System.currentTimeMillis();
        System.out.println("Time taken for second instance: " + (endTime - startTime));
    }
}
