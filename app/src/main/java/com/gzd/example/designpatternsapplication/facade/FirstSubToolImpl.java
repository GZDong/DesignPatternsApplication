package com.gzd.example.designpatternsapplication.facade;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class FirstSubToolImpl implements FirstSubTool {
    @Override
    public void doActionFirst() {
        Log.e("TAG", "doActionFirst: " + "i do" );
    }

    @Override
    public void cancelActionFirst() {
        Log.e("TAG", "doActionFirst: " + "i cancel" );
    }
}
