package com.gzd.example.designpatternsapplication.factory;

/**
 * Created by gzd on 2019/2/19 0019
 */
public abstract class AllFactory {
    public abstract <T extends Product> T getProduct(Class<T> product);
}
