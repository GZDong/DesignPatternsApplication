package com.gzd.example.designpatternsapplication.facade;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class SecondSubToolImpl implements SecondSubTool {
    @Override
    public void doActionSecond() {
        Log.e("TAG", "doActionSecond: " + "i do" );
    }

    @Override
    public void cancelActionSecond() {
        Log.e("TAG", "doActionSecond: " + "i cancel" );
    }
}
