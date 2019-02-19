package com.gzd.example.designpatternsapplication.factory;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class ProductAFactory extends Factory {
    @Override
    public Product getProduct() {
        //构建productA 。。。
        ProductA productA = new ProductA();
        productA.setConfig("test");
        return productA;
    }
}
