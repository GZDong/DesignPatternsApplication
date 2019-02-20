package com.gzd.example.designpatternsapplication.proxy.trainning;

import android.util.Log;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class ConxObject implements IAction{
    private String attr1;
    private Integer attr2;

    @Override
    public void doAction() {
        Log.e("TAG", "doAction: " + "ConxObject do it action" );
    }

    @Override
    public void removeAction() {
        Log.e("TAG", "doAction: " + "ConxObject do it remove" );
    }

    public String getAttr1() {
        return attr1;
    }

    public void setAttr1(String attr1) {
        this.attr1 = attr1;
    }

    public Integer getAttr2() {
        return attr2;
    }

    public void setAttr2(Integer attr2) {
        this.attr2 = attr2;
    }
}
