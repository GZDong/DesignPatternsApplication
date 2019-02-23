package com.gzd.example.designpatternsapplication.composite;

/**
 * Created by gzd on 2019/2/23 0023
 */
public abstract class Component {
    protected String name;

    public Component(String name){
        this.name = name;
    }

    public abstract void doSometing();
}
