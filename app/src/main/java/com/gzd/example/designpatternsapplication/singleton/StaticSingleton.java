package com.gzd.example.designpatternsapplication.singleton;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class StaticSingleton {
    private StaticSingleton(){}
    public static StaticSingleton getInstance(){
        return StaticSingletonHolder.sInstance;   //在被调用时，才真正去加载静态内部类
    }
    //利用静态成员保证对象的唯一性，所以在获取实例时，只是调用，没有创建
    //当2个线程同时实例化时，在java底层是需要排队的
    private static class StaticSingletonHolder{      //静态内部类不会在外部类被加载的时候被加载，所以其内部的成员也没有被实例化，实现懒加载
        private static final StaticSingleton sInstance = new StaticSingleton();  //缺点，这里不能通过getInstance传参
    }
}
