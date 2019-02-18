package com.gzd.example.designpatternsapplication.builder.trainning;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.gzd.example.designpatternsapplication.R;

public class Main2Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        WebConfig webConfig = new WebConfig.Builder()
                .setA1("a")
                .setA2("b")
                .setA3("c")
                .create();
        WebUtil webUtil = new WebUtil();
        webUtil.init(webConfig);
        webUtil.connectSite();
    }
}
