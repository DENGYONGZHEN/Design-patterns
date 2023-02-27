package com.deng.abstractFactoryPattern;

import com.deng.abstractFactoryPattern.ingredient.Cheese;
import com.deng.abstractFactoryPattern.ingredient.Dough;
import com.deng.abstractFactoryPattern.ingredient.Pepperoni;
import com.deng.abstractFactoryPattern.ingredient.Sauce;

/**
 * @Classname Pizza
 * @Description
 * @Version 1.0.0
 * @Date 2023/2/23 9:58
 * @Created by helloDeng
 */
public abstract class Pizza {
    protected String name;
    Dough dough;
    Sauce sauce;
    Cheese cheese;
    Pepperoni pepperoni;

    public abstract void prepare();
    public void bake(){
        System.out.println(name + ":baking");
    }
    public void cut(){
        System.out.println(name + ":cutting");
    }
    public void box(){
        System.out.println(name + ":boxing");
    }
    public void setName(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough=" + dough +
                ", sauce=" + sauce +
                ", cheese=" + cheese +
                ", pepperoni=" + pepperoni +
                '}';
    }
}
