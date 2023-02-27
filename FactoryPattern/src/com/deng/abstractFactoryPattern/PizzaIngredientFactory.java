package com.deng.abstractFactoryPattern;

import com.deng.abstractFactoryPattern.ingredient.Cheese;
import com.deng.abstractFactoryPattern.ingredient.Dough;
import com.deng.abstractFactoryPattern.ingredient.Pepperoni;
import com.deng.abstractFactoryPattern.ingredient.Sauce;

/**
 * @Classname PizzaIngredientFactory
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/23 9:39
 * @Created by helloDeng
 */
public interface PizzaIngredientFactory {

    public Dough createDough();
    public Sauce createSauce();
    public Cheese createCheese();
    public Pepperoni createPepperoni();

}
