package com.gzd.example.designpatternsapplication.composite;

import android.util.Log;

/**
 * Created by gzd on 2019/2/23 0023
 */
public class Leaf extends Component {
    public Leaf(String name) {
        super(name);
    }

    @Override
    public void doSometing() {
        Log.e("TAG", "doSometing: " + name );
    }
}
