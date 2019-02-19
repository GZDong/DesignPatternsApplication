package com.gzd.example.designpatternsapplication.stragety;

/**
 * Created by gzd on 2019/2/20 0020
 */
public class TestUtilError {

    public static String getDataForTestWithStragety1(String config){
        //stragety one;
        return "same result";
    }

    public static String getDataForTestWithStragety2(String config){
        //stragety two;
        return "same result";
    }

    //Or

    public static String getDataForTest(String config,int i){
        if (i == 1){
            //stragety one;
        }else if (i == 2){
            //stragety two;
        }
        return "same result";
    }
}
