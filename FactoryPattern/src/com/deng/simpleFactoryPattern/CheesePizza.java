package com.deng.simpleFactoryPattern;

/**
 * @Classname CheesePizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 22:40
 * @Created by helloDeng
 */
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        setName("cheese");
        System.out.println(name + ":perparing");
    }
}
