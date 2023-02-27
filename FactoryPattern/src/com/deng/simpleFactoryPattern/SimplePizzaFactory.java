package com.deng.simpleFactoryPattern;

/**
 * @Classname SimplePizzaFactory
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/22 22:38
 * @Created by helloDeng
 */
public class SimplePizzaFactory {
    public Pizza createPizza(String type){
        Pizza pizza = null;
        if(type.equals("cheese")){
            pizza = new CheesePizza();
        } else if (type.equals("pepperoni")) {
            pizza = new PepperoniPizza();
        } else if (type.equals("clam")) {
            pizza = new ClamPizza();
        }
        return pizza;
    }
}
