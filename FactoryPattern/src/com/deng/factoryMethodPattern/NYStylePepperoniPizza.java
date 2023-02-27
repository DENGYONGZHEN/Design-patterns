package com.deng.factoryMethodPattern;

/**
 * @Classname NYStylePepperoniPizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 23:33
 * @Created by helloDeng
 */
public class NYStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        setName("NYStylePepperoniPizza");
        System.out.println(name + ":preparing");
    }
}
