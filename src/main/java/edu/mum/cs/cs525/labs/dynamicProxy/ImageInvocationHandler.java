package edu.mum.cs.cs525.labs.dynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ImageInvocationHandler implements InvocationHandler {
    private Object realObject;

    public ImageInvocationHandler(Object realObject) {
        this.realObject = realObject;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(realObject, args);
    }
}
