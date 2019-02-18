package com.gzd.example.designpatternsapplication.builder;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class IOSComputer extends Computer {
    protected IOSComputer(){

    }
    @Override
    public void setOS(String OS) {
        mOS = "unite " + OS;
    }
}
