package com.gzd.example.designpatternsapplication.singleton.trainning;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class StaticT1 {
    private StaticT1(){

    }
    public static StaticT1 getInstance(){
        return StaticT1Holder.sStaticT1;
    }
    private static class StaticT1Holder{
        private static final StaticT1 sStaticT1 = new StaticT1();
    }
}
