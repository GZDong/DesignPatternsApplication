package com.gzd.example.designpatternsapplication.factory;

/**
 * Created by gzd on 2019/2/19 0019
 */
public class ExcaAllFactory extends AllFactory {
    @Override
    public <T extends Product> T getProduct(Class<T> product) {
        Product pro = null;
        try {
            pro = (Product) Class.forName(product.getName()).newInstance();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return (T) pro;
    }
}
