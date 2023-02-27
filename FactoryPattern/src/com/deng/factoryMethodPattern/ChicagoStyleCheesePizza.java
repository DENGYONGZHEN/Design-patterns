package com.deng.factoryMethodPattern;

/**
 * @Classname ChicagoStyleCheesePizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 23:24
 * @Created by helloDeng
 */
public class ChicagoStyleCheesePizza extends Pizza{
    @Override
    public void prepare() {
        setName("ChicagoStyleCheesePizza");
        System.out.println(name + ":preparing");
    }
}
