package edu.mum.cs.cs525.labs.dynamicProxy;

import java.lang.reflect.Proxy;

public class Main {
    public static void main(String[] args) {
        RealImage realImage = new RealImage("test.jpg");

        /*  Create Dynamic Proxy for the Real Image */
        Image imageProxy = (Image) Proxy.newProxyInstance(
                Image.class.getClassLoader(),
                new Class<?>[] {Image.class},
                new ImageInvocationHandler(realImage)
        );

        imageProxy.display();
    }
}
