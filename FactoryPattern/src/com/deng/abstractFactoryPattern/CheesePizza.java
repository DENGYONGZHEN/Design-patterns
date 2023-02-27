package com.deng.abstractFactoryPattern;

import com.deng.abstractFactoryPattern.ingredient.Cheese;

/**
 * @Classname CheesePizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/23 10:05
 * @Created by helloDeng
 */
public class CheesePizza extends Pizza{
    PizzaIngredientFactory pizzaIngredientFactory;

    public CheesePizza(PizzaIngredientFactory pizzaIngredientFactory) {
        this.pizzaIngredientFactory = pizzaIngredientFactory;
    }

    @Override
    public void prepare() {
        System.out.println(name + ":preparing");
        cheese = pizzaIngredientFactory.createCheese();
        dough = pizzaIngredientFactory.createDough();
        sauce = pizzaIngredientFactory.createSauce();
        pepperoni = pizzaIngredientFactory.createPepperoni();
    }
}
