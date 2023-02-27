package com.deng.abstractFactoryPattern.ingredient;


import com.deng.abstractFactoryPattern.Pizza;

/**
 * @Classname PizzaStore
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/23 10:09
 * @Created by helloDeng
 */
public abstract class PizzaStore {
    public Pizza orderPizza(String type){
        System.out.println("订购pizza");
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
