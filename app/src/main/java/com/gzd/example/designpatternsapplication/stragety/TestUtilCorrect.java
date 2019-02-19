package com.gzd.example.designpatternsapplication.stragety;

/**
 * Created by gzd on 2019/2/20 0020
 */
public class TestUtilCorrect {
    public String getDataForTest(String config,Stragety stragety){
        String result = stragety.getResult(config);
        return result;
    }
}
