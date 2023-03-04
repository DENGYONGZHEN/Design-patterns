package com.deng.framwork;

/**
 * @Classname Factory
 * @Description   实现了create方法的抽象类
 * @Version 1.0.0
 * @Date 2023/2/14 14:31
 * @Created by helloDeng
 */
public abstract class Factory {
    public final Product create(String owner){     //使用了 template method模式
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }
    protected abstract Product createProduct(String owner);
    protected abstract void registerProduct(Product p);
}
