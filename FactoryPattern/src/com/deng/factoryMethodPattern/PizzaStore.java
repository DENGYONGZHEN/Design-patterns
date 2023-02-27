package com.deng.factoryMethodPattern;



/**
 * @Classname PizzaStore
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 23:19
 * @Created by helloDeng
 */
public abstract class PizzaStore {

    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = this.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);
}
