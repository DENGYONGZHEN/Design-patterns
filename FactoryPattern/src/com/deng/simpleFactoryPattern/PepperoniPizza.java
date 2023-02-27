package com.deng.simpleFactoryPattern;

/**
 * @Classname PepperoniPizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 22:41
 * @Created by helloDeng
 */
public class PepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        setName("pepperoni");
        System.out.println(name + ":perparing");
    }
}
