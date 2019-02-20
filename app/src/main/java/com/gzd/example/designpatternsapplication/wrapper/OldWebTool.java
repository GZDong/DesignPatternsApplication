package com.gzd.example.designpatternsapplication.wrapper;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class OldWebTool extends WebConnection {
    @Override
    public void connection() {
        Log.e("TAG", "connection: " + "old connect" );
    }
}
