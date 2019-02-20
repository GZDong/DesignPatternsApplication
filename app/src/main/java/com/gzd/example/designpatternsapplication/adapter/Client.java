package com.gzd.example.designpatternsapplication.adapter;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class Client {
    private ForTargetInterfaceAdapter mAdapter;
    public void setAdatper(ForTargetInterfaceAdapter adatper){
        mAdapter = adatper;
    }

    public void doSomething(){
        Log.e("TAG", "doSomething: " + "begin to work" );
        mAdapter.targetMethod();
    }
}
