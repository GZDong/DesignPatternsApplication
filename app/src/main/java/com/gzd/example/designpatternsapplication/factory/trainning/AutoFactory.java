package com.gzd.example.designpatternsapplication.factory.trainning;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class AutoFactory {
    public static <T extends Product> T getProduct(Class<T> productName){
        Product product = null;
        try {
            product = (Product) Class.forName(productName.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) product;
    }
}
