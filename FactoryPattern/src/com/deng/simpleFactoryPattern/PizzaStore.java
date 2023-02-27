package com.deng.simpleFactoryPattern;



/**
 * @Classname PizzaStore
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 22:35
 * @Created by helloDeng
 */
public class PizzaStore {

    SimplePizzaFactory factory;

    public PizzaStore(SimplePizzaFactory factory) {
        this.factory = factory;
    }
    public Pizza orderPizza(String type){
        Pizza pizza;
        pizza = factory.createPizza(type);
        pizza.prepare();
        pizza.bake();
        pizza.cut();
        pizza.box();
        return pizza;
    }
}
