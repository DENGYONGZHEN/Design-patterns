package com.deng.factoryMethodPattern;



/**
 * @Classname NYStylePizzaStore
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 23:25
 * @Created by helloDeng
 */
public class NYStylePizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new NYStyleCheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new NYStylePepperoniPizza();
        }
        return pizza;
    }
}
