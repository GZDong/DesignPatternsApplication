package com.gzd.example.designpatternsapplication.factory;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class ProductBFactory extends Factory {
    @Override
    public Product getProduct() {
        ProductB productB = new ProductB();
        productB.setConfig("test");
        return productB;
    }
}
