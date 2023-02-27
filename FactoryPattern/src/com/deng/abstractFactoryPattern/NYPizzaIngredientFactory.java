package com.deng.abstractFactoryPattern;

import com.deng.abstractFactoryPattern.ingredient.*;

/**
 * @Classname NYPizzaIngredientFactory
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/23 9:50
 * @Created by helloDeng
 */
public class NYPizzaIngredientFactory implements PizzaIngredientFactory{
    @Override
    public Dough createDough() {
        System.out.println("准备NYDough");
        return new NYDough();
    }

    @Override
    public Sauce createSauce() {
        System.out.println("准备NYSauce");
        return new NYSauce();
    }

    @Override
    public Cheese createCheese() {
        System.out.println("准备NYCheese");
        return new NYCheese();
    }

    @Override
    public Pepperoni createPepperoni() {
        System.out.println("准备NYPepperoni");
        return new NYPepperoni();
    }
}
