package com.gzd.example.designpatternsapplication.proxy;

/**
 * Created by gzd on 2019/2/21 0021
 */
public class ClientProxy extends Subject {
    private Subject mClient;

    public ClientProxy(Subject client){
        mClient = client;
    }

    @Override
    public void doAction() {
        mClient.doAction();
    }

    @Override
    public void finish() {
        mClient.finish();
    }
}
