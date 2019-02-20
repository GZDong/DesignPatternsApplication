package com.gzd.example.designpatternsapplication.proxy;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class Client2 implements ISubject {
    @Override
    public void doAction() {
        Log.e("TAG", "doAction: " + "22222" );

    }

    @Override
    public void finish() {
        Log.e("TAG", "finish: " + "22222" );
    }
}
