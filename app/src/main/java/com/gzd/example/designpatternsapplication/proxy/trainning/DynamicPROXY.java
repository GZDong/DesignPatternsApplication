package com.gzd.example.designpatternsapplication.proxy.trainning;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class DynamicPROXY implements InvocationHandler {
    private Object mObject;

    public DynamicPROXY(Object o){
        mObject = o;
    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object o = method.invoke(mObject,args);
        return o;
    }
}
