package com.deng.factoryMethodPattern;

/**
 * @Classname ChicagoStylePizzaStore
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 23:35
 * @Created by helloDeng
 */
public class ChicagoStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new ChicagoStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new ChicagoStylePepperoniPizza();
        }
        return pizza;
    }
}
