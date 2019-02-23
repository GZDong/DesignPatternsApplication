package com.gzd.example.designpatternsapplication.composite;

/**
 * Created by gzd on 2019/2/23 0023
 */
public abstract class TComponent {
    protected String name;

    public TComponent(String name){
        this.name = name;
    }

    public abstract void doSomething();

    /**
     * @param child
     */
    public abstract void addChild(TComponent child);
    public abstract void removeChild(TComponent child);

    /**
     * @param index
     * @return TComponent
     */
    public abstract TComponent getChildren(int index);
}
