package com.deng.practice;

/**
 * @Classname Product
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/15 21:13
 * @Created by helloDeng
 */
public abstract class Product implements Cloneable{

    public abstract void use(String s);
    public Product creatClone(Product product){
        Product p = null;
        try {
            p = (Product) product.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
        return  p;
    };
}
