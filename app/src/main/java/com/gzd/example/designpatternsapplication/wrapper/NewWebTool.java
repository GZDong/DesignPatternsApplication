package com.gzd.example.designpatternsapplication.wrapper;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class NewWebTool extends WrapperWebTool {
    public NewWebTool(WebConnection webConnection) {
        super(webConnection);
    }

    @Override
    public void connection() {
        checkConnection();
        super.connection();
    }

    public void checkConnection(){
        Log.e("TAG", "checkConnection: " + "check its OK" );
    }
}
