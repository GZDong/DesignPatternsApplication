package com.gzd.example.designpatternsapplication;

import android.app.Application;
import android.content.Context;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class BaseApplication extends Application {
    private static Context mContext;
    @Override
    public void onCreate() {
        super.onCreate();
        mContext = getApplicationContext();
    }

    public static Context getContext(){
        return mContext;
    }
}
