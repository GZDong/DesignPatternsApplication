package com.gzd.example.designpatternsapplication.wrapper;

/**
 * Created by gzd on 2019/2/21 0021
 */
public abstract class WrapperWebTool extends WebConnection{
    protected WebConnection mWebConnection;
    public WrapperWebTool(WebConnection webConnection){
        mWebConnection = webConnection;
    }

    @Override
    public void connection() {
        mWebConnection.connection();
    }
}
