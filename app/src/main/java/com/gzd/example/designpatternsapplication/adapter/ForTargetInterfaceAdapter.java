package com.gzd.example.designpatternsapplication.adapter;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class ForTargetInterfaceAdapter implements Target {
    private ResClass mResClass;
    public ForTargetInterfaceAdapter(ResClass resClass){
        mResClass = resClass;
    }
    @Override
    public void targetMethod() {
        Log.e("TAG", "targetMethod: " + mResClass.myOwnMethod() + " was adapt" );
    }
}
