package com.gzd.example.designpatternsapplication.composite;

/**
 * Created by gzd on 2019/2/24 0024
 */
public class TLeaf extends TComponent {
    public TLeaf(String name) {
        super(name);
    }

    @Override
    public void doSomething() {

    }

    @Override
    public void addChild(TComponent child) {

    }

    @Override
    public void removeChild(TComponent child) {

    }

    @Override
    public TComponent getChildren(int index) {
        return null;
    }
}
