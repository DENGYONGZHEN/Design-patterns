package com.deng.factoryMethodPattern;

/**
 * @Classname NYStyleCheesePizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 23:23
 * @Created by helloDeng
 */
public class NYStyleCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("NYStyleCheesePizza");
        System.out.println(name + ":preparing");
    }
}
