package com.gzd.example.designpatternsapplication.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gzd on 2019/2/24 0024
 */
public class TComposite extends TComponent {
    private List<TComponent> mTComponents = new ArrayList<>();  //持有

    public TComposite(String name){
        super(name);
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

    @Override
    public void doSomething() {

    }
}
