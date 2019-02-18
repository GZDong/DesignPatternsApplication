package com.gzd.example.designpatternsapplication.singleton;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class DoubleCheckLock {
    private static DoubleCheckLock sInstance;
    private DoubleCheckLock(){         //避免new

    }
    public static DoubleCheckLock getInstance(){
        if (sInstance == null){                        //避免了每次调用时都要因为同步问题的消耗
            synchronized (DoubleCheckLock.class){     //避免并发访问造成多对象的情况
                if (sInstance == null){
                    sInstance = new DoubleCheckLock();
                }
            }
        }
        return sInstance;
    }
}
