package com.deng.abstractFactoryPattern.ingredient;

import com.deng.abstractFactoryPattern.CheesePizza;
import com.deng.abstractFactoryPattern.NYPizzaIngredientFactory;
import com.deng.abstractFactoryPattern.Pizza;
import com.deng.abstractFactoryPattern.PizzaIngredientFactory;


/**
 * @Classname NYPizzaStore
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/23 10:11
 * @Created by helloDeng
 */
public class NYPizzaStore extends PizzaStore{
    @Override
    protected Pizza createPizza(String type) {
        System.out.println("制作pizza");
        Pizza pizza = null;
        PizzaIngredientFactory factory = new NYPizzaIngredientFactory();
        if("cheese".equals(type)){
            pizza = new CheesePizza(factory);
            pizza.setName("NYcheesepizza");
        } else if ("pepperoni".equals(type)) {
            pizza = new CheesePizza(factory);
            pizza.setName("NYpepperonipizza");
        }
        return pizza;
    }
}
