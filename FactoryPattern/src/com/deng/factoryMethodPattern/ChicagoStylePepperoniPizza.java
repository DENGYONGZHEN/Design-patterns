package com.deng.factoryMethodPattern;

/**
 * @Classname ChicagoStylePepperoniPizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 23:36
 * @Created by helloDeng
 */
public class ChicagoStylePepperoniPizza extends Pizza {
    @Override
    public void prepare() {
        setName("ChicagoStylePepperoniPizza");
        System.out.println(name + ":preparing");
    }
}
