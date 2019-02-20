package com.gzd.example.designpatternsapplication.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class DynamicProxy implements InvocationHandler {
    private Object mObject = null;

    public DynamicProxy(Object object){
        mObject = object;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = method.invoke(mObject,args);
        return result;
    }
}
