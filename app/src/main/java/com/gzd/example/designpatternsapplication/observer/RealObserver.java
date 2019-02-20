package com.gzd.example.designpatternsapplication.observer;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class RealObserver implements Observer {
    @Override
    public String update(String data) {
        Log.e("TAG", "update: " + data );
        return data;
    }
}
