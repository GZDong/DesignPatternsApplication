package com.gzd.example.designpatternsapplication.composite;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by gzd on 2019/2/23 0023
 */
public class Composite extends Component {

    private List<Component> mComponents = new ArrayList<>();
    public Composite(String name) {
        super(name);
    }

    @Override
    public void doSometing() {
        if (null != mComponents){
            for (Component component : mComponents){
                component.doSometing();
            }
        }
    }

    public void addChild(Component child){
        mComponents.add(child);
    }

    public void removeChild(Component child){
        mComponents.remove(child);
    }

    public Component getChild(int index){
        return mComponents.get(index);
    }
}
