package com.gzd.example.designpatternsapplication.facade;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class SuperToolImpl implements SuperTool {
    private FirstSubTool mFirstSubTool = new FirstSubToolImpl();
    private SecondSubTool mSecondSubTool = new SecondSubToolImpl();   //可以看到，子系统的构建，用户完全不用管
    @Override
    public void doAction() {
        mFirstSubTool.doActionFirst();
        mSecondSubTool.cancelActionSecond();
    }

    @Override
    public void cancelAction() {
        mSecondSubTool.doActionSecond();
        mFirstSubTool.cancelActionFirst();
        mFirstSubTool.cancelActionFirst();
        mSecondSubTool.cancelActionSecond();
    }
}
