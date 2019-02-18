package com.gzd.example.designpatternsapplication.builder;

/**
 * Created by gzd on 2019/2/19 0019
 */
public abstract class Computer {
    protected String mBoard;    //要给子类的不能时private
    protected String mDisplay;
    protected String mOS;

    protected Computer(){

    }

    public void setBoard(String board) {    //抽象类的好处，一些共有的东西在父类里实现，子类照搬
        mBoard = board;
    }

    public void setDisplay(String display) {
        mDisplay = display;
    }

    public abstract void setOS(String OS);   //会不同的操作抽象化
}
