package com.gzd.example.designpatternsapplication.builder.trainning;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class WebUtil {
    private String a1;
    private String a2;
    private String a3;

    public void init(WebConfig webConfig){
        a1 = webConfig.a1;
        a2 = webConfig.a2;
        a3 = webConfig.a3;
    }
    public void connectSite(){
        //connect server
    }
}
